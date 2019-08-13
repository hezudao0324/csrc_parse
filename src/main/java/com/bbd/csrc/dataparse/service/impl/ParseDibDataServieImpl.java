package com.bbd.csrc.dataparse.service.impl;

import com.bbd.csrc.dataparse.dao.CompanyBasicInfoDAO;
import com.bbd.csrc.dataparse.dao.DibDirectorKeyresumeDAO;
import com.bbd.csrc.dataparse.dao.DibSharesActualControllerDAO;
import com.bbd.csrc.dataparse.dao.DibSharesMajorShareholderInfoDAO;
import com.bbd.csrc.dataparse.domain.CompanyBasicInfo;
import com.bbd.csrc.dataparse.domain.DibDirectorKeyresume;
import com.bbd.csrc.dataparse.domain.DibSharesActualController;
import com.bbd.csrc.dataparse.domain.DibSharesMajorShareholderInfo;
import com.bbd.csrc.dataparse.service.ParseDibDataService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by hyf on 2019-06-18.
 * <p>
 * 将迪博数据库表dib_director_keyresume中position根据规则解析后
 * 放到company_basic_info
 */
@Service
public class ParseDibDataServieImpl implements ParseDibDataService {

    @Autowired
    DibDirectorKeyresumeDAO dibDirectorKeyresumeDAO;
    @Autowired
    CompanyBasicInfoDAO companyBasicInfoDAO;
    @Autowired
    DibSharesActualControllerDAO dibSharesActualControllerDAO;
    @Autowired
    DibSharesMajorShareholderInfoDAO dibSharesMajorShareholderInfoDAO;


    @Override
    public void parsePositon() {
        String reportDate = "2017-12-31";
        List<String> secCodeList = dibDirectorKeyresumeDAO.selectSecCodeGroupBySecCode(reportDate);
        List<CompanyBasicInfo> updateList = new ArrayList<>();
        secCodeList.stream().forEach(secCode -> {
            System.out.println(">>>>>>>>>>>>>>" + secCode);
            List<DibDirectorKeyresume> list = dibDirectorKeyresumeDAO.selectBySecCode(secCode, reportDate);
            int independent_board_amount = 0;//独立董事人数
            int independent_amount = 0;//董事人数
//            int dsz_amount = 0;//董事长人数
//            int zjl_amount = 0;//总经理人数
            String dsz = null;
            String zjl = null;
            boolean partTime = false;
            for (DibDirectorKeyresume entry : list) {
                String position = entry.getPosition();
                if (position.contains("董")) {
                    independent_amount++;
                }
                if (position.contains("独立董事") && !position.contains("非独立董事")) {
                    independent_board_amount++;
                }
                if ((position.contains("董事长") && !position.contains("副董事长")) || position.contains("董事会主席")) {
//                    dsz_amount++;
                    dsz = entry.getName();
                }
                if (position.contains("总经理") && !position.contains("副总经理") && !position.contains("群总经理")
                        && !position.contains("部总经理") && !position.contains("厂总经理")) {
//                    zjl_amount++;
                    zjl = entry.getName();
                }
            }
            if (dsz != null && zjl != null && dsz.equals(zjl)) {
                partTime = true;
            }
            double independent_board_ratio = BigDecimal.valueOf(independent_board_amount)
                    .divide(BigDecimal.valueOf(independent_amount), 2, BigDecimal.ROUND_HALF_UP).doubleValue();
            CompanyBasicInfo companyBasicInfo = new CompanyBasicInfo();
            companyBasicInfo.setStockCode(secCode);
            companyBasicInfo.setPartTime(partTime);
            companyBasicInfo.setIndependentBoardAmount(independent_board_amount);
            companyBasicInfo.setIndependentBoardRatio(independent_board_ratio);
            updateList.add(companyBasicInfo);
        });

        companyBasicInfoDAO.updateBatchByStockCode(updateList);
        System.out.println("更新完成");
    }

    @Override
    public void parseHolder() {
        String reportDate = "2018-12-31";
        List<String> secCodeList = dibSharesMajorShareholderInfoDAO.selectSecCodeGroupBySecCode(reportDate);
        List<CompanyBasicInfo> updateList = new ArrayList<>();
        for (String secCode : secCodeList) {
            System.out.println(">>>>>>>>>>>>>" + secCode);
            List<DibSharesMajorShareholderInfo> shareholderList = dibSharesMajorShareholderInfoDAO.selectBySecCode(secCode, reportDate);

            Optional<DibSharesMajorShareholderInfo> optional = shareholderList.stream()
                    .filter(s -> s.getSharePerce() != null && s.getSharePerce().doubleValue() <= 100)
                    .sorted((s1, s2) -> s2.getSharePerce().subtract(s1.getSharePerce()).intValue()).findFirst();

            double share_holding_ratio = 0;

            for (DibSharesMajorShareholderInfo s : shareholderList) {
                share_holding_ratio += (s.getSharePerce() == null ? 0 : s.getSharePerce().setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
            }

            CompanyBasicInfo info = new CompanyBasicInfo();

            optional.ifPresent(o -> {
                info.setFirstHolderName(o.getSharehName());
                info.setFirstHolderPct(o.getSharePerce().setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
            });
            info.setStockCode(secCode);
            info.setShareHoldingRatio(share_holding_ratio);
            updateList.add(info);
            if (updateList.size() > 100) {
                companyBasicInfoDAO.updateBatchByStockCode(updateList);
                updateList.clear();
            }
        }
        companyBasicInfoDAO.updateBatchByStockCode(updateList);
    }

    @Override
    public void parseController() {
        List<String> delList = new ArrayList<String>() {{
            add("实际控制人姓名");
            add("控股股东姓名");
            add("实际控制人名称");
            add("最终控制层面股东名称");
            add("最终控制层面股东报告期内控制的其他境内外上市公司的股权情况");
            add("最终控制层面股东姓名");
        }};
        String reportDate = "2018-12-31";
        List<String> secCodeList = dibSharesActualControllerDAO.selectSecCodeGroupBySecCode(reportDate);
        List<CompanyBasicInfo> updateList = new ArrayList<>();
        for (String secCode : secCodeList) {
            System.out.println(">>>>>>>>>>>>>>>" + secCode);
            List<DibSharesActualController> controllerList = dibSharesActualControllerDAO.selectBySecCode(secCode, reportDate);
            String controllers = "";
            for (DibSharesActualController c : controllerList) {
                if (c.getActualContrName() == null || delList.contains(c.getActualContrName())) {
                    continue;
                }
                controllers += c.getActualContrName() + ",";
            }
            CompanyBasicInfo info = new CompanyBasicInfo();
            if (StringUtils.isNotEmpty(controllers)) {
                info.setStockCode(secCode);
                info.setsHolderController(controllers.substring(0, controllers.length() - 1));
                updateList.add(info);
            }
            if (updateList.size() > 100) {
                companyBasicInfoDAO.updateBatchByStockCode(updateList);
                updateList.clear();
            }
        }
        companyBasicInfoDAO.updateBatchByStockCode(updateList);
    }
}
