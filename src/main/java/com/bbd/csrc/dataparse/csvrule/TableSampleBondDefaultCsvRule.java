package com.bbd.csrc.dataparse.csvrule;

import com.bbd.csrc.dataparse.dao.CompanyBasicInfoDAO;
import com.bbd.csrc.dataparse.dao.TableSampleBondDefaultDAO;
import com.bbd.csrc.dataparse.domain.TableSampleBondDefault;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 债券违约
 * Created by hyf on 2019-03-20.
 */
@Component
@Slf4j
public class TableSampleBondDefaultCsvRule implements CsvRule<TableSampleBondDefault> {

    @Autowired
    TableSampleBondDefaultDAO tableSampleBondDefaultDAO;
    @Autowired
    CompanyBasicInfoDAO companyBasicInfoDAO;

    public void beforeDeal() {
        log.info(">>>>>>>>>>>>>> 开始解析债券违约");
        tableSampleBondDefaultDAO.truncateTable();
    }

    @Override
    public void afterDeal() {
        log.info(">>>>>>>>>>>>> 解析债券违约成功");
    }

    @Override
    public void dealWithResult(List<TableSampleBondDefault> list) {
        list.stream().forEach(record -> {
            String bbdQyxxId = companyBasicInfoDAO.queryQyxxIdByName(record.get公司名称());
            record.setBbdQyxxId(bbdQyxxId);
            log.info(record.toString());
        });
        tableSampleBondDefaultDAO.insertBatch(list);
    }

    @Override
    public String fileNameRegex() {
        return "^(table_sample_债券违约)*(.csv)$";
    }


//    private void accept(TableSampleBondDefault record) {
//        String bbdQyxxId = companyBasicInfoDAO.queryQyxxIdByName(record.get公司名称());
//        record.setBbdQyxxId(bbdQyxxId);
//        log.info(record.toString());
//        TableSampleBondDefault exist = tableSampleBondDefaultDAO.queryByCompanyName(record.get公司名称());
//        if (exist == null) {
//            tableSampleBondDefaultDAO.insert(record);
//        } else {
//            tableSampleBondDefaultDAO.updateByCompanyName(record);
//        }
//    }
}
