package com.bbd.csrc.dataparse.csvrule;

import com.bbd.csrc.dataparse.domain.TableWeightLetterDefault;
import com.bbd.csrc.dataparse.service.AnalyIndexConfigDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by hyf on 2019-03-21.
 */
@Component
@Slf4j
public class TableWeightLetterDefaultCsvRule implements CsvRule<TableWeightLetterDefault> {

    @Autowired
    AnalyIndexConfigDataService analyIndexConfigDataService;

    public void beforeDeal(){
        log.info(">>>>>>>>>>>>>> 开始解析(权重)信披违规");
    }

    @Override
    public void afterDeal() {
        log.info(">>>>>>>>>>>>> 解析(权重)信披违规成功");
    }

    @Override
    public void dealWithResult(List<TableWeightLetterDefault> list) {
        analyIndexConfigDataService.updateWeightBatch("信披违规", list);
    }


    @Override
    public String fileNameRegex() {
        return "^(table_weight_信披违约)*(.csv)$";

    }
}
