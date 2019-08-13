package com.bbd.csrc.dataparse.csvrule;

import com.bbd.csrc.dataparse.dao.CompanyBasicInfoDAO;
import com.bbd.csrc.dataparse.dao.TableSampleLetterDefaultDAO;
import com.bbd.csrc.dataparse.domain.TableSampleLetterDefault;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 信披违规
 * Created by hyf on 2019-03-20.
 */
@Component
@Slf4j
public class TableSampleLetterDefaultCsvRule implements CsvRule<TableSampleLetterDefault> {

    @Autowired
    CompanyBasicInfoDAO companyBasicInfoDAO;
    @Autowired
    TableSampleLetterDefaultDAO tableSampleLetterDefaultDAO;

    public void beforeDeal(){
        log.info(">>>>>>>>>>>>>> 开始解析信披违规");
        tableSampleLetterDefaultDAO.truncateTable();
    }

    @Override
    public void afterDeal() {
        log.info(">>>>>>>>>>>>> 解析信披违规成功");
    }

    @Override
    public void dealWithResult(List<TableSampleLetterDefault> list) {
        list.stream().forEach(record->{
            String bbdQyxxId = companyBasicInfoDAO.queryQyxxIdByName(record.get公司名称());
            record.setBbdQyxxId(bbdQyxxId);
            log.info(record.toString());
        });
        tableSampleLetterDefaultDAO.insertBatch(list);
    }


    @Override
    public String fileNameRegex() {
        return "^(table_sample_信披违约)*(.csv)$";
    }

    private void accept(TableSampleLetterDefault record) {
        String bbdQyxxId = companyBasicInfoDAO.queryQyxxIdByName(record.get公司名称());
        record.setBbdQyxxId(bbdQyxxId);
        log.info(record.toString());
        TableSampleLetterDefault exist = tableSampleLetterDefaultDAO.queryByCompanyName(record.get公司名称());
        if (exist == null) {
            tableSampleLetterDefaultDAO.insert(record);
        } else {
            tableSampleLetterDefaultDAO.updateByCompanyName(record);
        }
    }
}
