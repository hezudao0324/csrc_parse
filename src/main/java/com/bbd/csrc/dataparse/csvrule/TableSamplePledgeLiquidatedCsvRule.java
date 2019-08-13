package com.bbd.csrc.dataparse.csvrule;

import com.bbd.csrc.dataparse.dao.CompanyBasicInfoDAO;
import com.bbd.csrc.dataparse.dao.TableSamplePledgeLiquidatedDAO;
import com.bbd.csrc.dataparse.domain.TableSamplePledgeLiquidated;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 质押平仓
 * Created by hyf on 2019-03-20.
 */
@Component
@Slf4j
public class TableSamplePledgeLiquidatedCsvRule implements CsvRule<TableSamplePledgeLiquidated> {

    @Autowired
    CompanyBasicInfoDAO companyBasicInfoDAO;
    @Autowired
    TableSamplePledgeLiquidatedDAO tableSamplePledgeLiquidatedDAO;

    public void beforeDeal() {
        log.info(">>>>>>>>>>>>>> 开始解析质押平仓");
        tableSamplePledgeLiquidatedDAO.truncateTable();
    }

    @Override
    public void afterDeal() {
        log.info(">>>>>>>>>>>>> 解析质押平仓成功");
    }

    @Override
    public void dealWithResult(List<TableSamplePledgeLiquidated> list) {
        list.stream().forEach(record -> {
            String bbdQyxxId = companyBasicInfoDAO.queryQyxxIdByName(record.get公司名称());
            record.setBbdQyxxId(bbdQyxxId);
            log.info(record.toString());
        });
        tableSamplePledgeLiquidatedDAO.insertBatch(list);
    }


    @Override
    public String fileNameRegex() {
        return "^(table_sample_质押平仓)*(.csv)$";
    }

    private void accept(TableSamplePledgeLiquidated record) {
        String bbdQyxxId = companyBasicInfoDAO.queryQyxxIdByName(record.get公司名称());
        record.setBbdQyxxId(bbdQyxxId);
        log.info(record.toString());
        TableSamplePledgeLiquidated exist = tableSamplePledgeLiquidatedDAO.queryByCompanyName(record.get公司名称());
        if (exist == null) {
            tableSamplePledgeLiquidatedDAO.insert(record);
        } else {
            tableSamplePledgeLiquidatedDAO.updateByCompanyName(record);
        }
    }
}
