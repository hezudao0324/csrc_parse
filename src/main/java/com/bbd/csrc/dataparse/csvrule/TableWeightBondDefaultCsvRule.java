package com.bbd.csrc.dataparse.csvrule;

import com.bbd.csrc.dataparse.domain.TableWeightBondDefault;
import com.bbd.csrc.dataparse.service.AnalyIndexConfigDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by hyf on 2019-03-22.
 */
@Component
@Slf4j
public class TableWeightBondDefaultCsvRule implements CsvRule<TableWeightBondDefault> {

    @Autowired
    AnalyIndexConfigDataService analyIndexConfigDataService;

    public void beforeDeal(){
        log.info(">>>>>>>>>>>>>> 开始解析(权重)债券违约");
    }

    @Override
    public void afterDeal() {
        log.info(">>>>>>>>>>>>> 解析(权重)债券违约成功");
    }

    @Override
    public void dealWithResult(List<TableWeightBondDefault> list) {
        analyIndexConfigDataService.updateWeightBatch("债券违约", list);
    }

    @Override
    public String fileNameRegex() {
        return "^(table_weight_债券违约)*(.csv)$";
    }
}
