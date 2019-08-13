package com.bbd.csrc.dataparse.csvrule;

import com.bbd.csrc.dataparse.dao.CompanyBasicInfoDAO;
import com.bbd.csrc.dataparse.dao.TableSampleIllegalGuaranteeDAO;
import com.bbd.csrc.dataparse.domain.TableSampleIllegalGuarantee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 违规担保
 * Created by hyf on 2019-03-20.
 */
@Component
@Slf4j
public class TableSampleIllegalGuaranteeCsvRule implements CsvRule<TableSampleIllegalGuarantee> {

    @Autowired
    TableSampleIllegalGuaranteeDAO tableSampleIllegalGuaranteeDAO;
    @Autowired
    CompanyBasicInfoDAO companyBasicInfoDAO;

    public void beforeDeal(){
        log.info(">>>>>>>>>>>>>> 开始解析违规担保");
        tableSampleIllegalGuaranteeDAO.truncateTable();
    }

    @Override
    public void dealWithResult(List<TableSampleIllegalGuarantee> list) {
        list.stream().forEach(record->{
            String bbdQyxxId = companyBasicInfoDAO.queryQyxxIdByName(record.get公司名称());
            record.setBbdQyxxId(bbdQyxxId);
            log.info(record.toString());
        });
        tableSampleIllegalGuaranteeDAO.insertBatch(list);
    }


    @Override
    public String fileNameRegex() {
        return "^(table_sample_违规担保)*(.csv)$";
    }

    @Override
    public void afterDeal() {
        log.info(">>>>>>>>>>>>> 解析违规担保成功");
    }

    private void accept(TableSampleIllegalGuarantee record) {
        String bbdQyxxId = companyBasicInfoDAO.queryQyxxIdByName(record.get公司名称());
        record.setBbdQyxxId(bbdQyxxId);
        log.info(record.toString());
        TableSampleIllegalGuarantee exist = tableSampleIllegalGuaranteeDAO.queryByCompanyName(record.get公司名称());
        if (exist == null) {
            tableSampleIllegalGuaranteeDAO.insert(record);
        } else {
            tableSampleIllegalGuaranteeDAO.updateByCompanyName(record);
        }
    }
}
