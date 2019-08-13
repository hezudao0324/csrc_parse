package com.bbd.csrc.dataparse.csvrule;

import com.bbd.csrc.dataparse.domain.TableWeightPledgeLiquidated;
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
public class TableWeightPledgeLiquidatedCsvRule implements CsvRule<TableWeightPledgeLiquidated> {

    @Autowired
    AnalyIndexConfigDataService analyIndexConfigDataService;


    public void beforeDeal(){
        log.info(">>>>>>>>>>>>>> 开始解析(权重)质押平仓");
    }

    @Override
    public void afterDeal() {
        log.info(">>>>>>>>>>>>> 解析(权重)质押平仓成功");
    }

    @Override
    public void dealWithResult(List<TableWeightPledgeLiquidated> list) {
        analyIndexConfigDataService.updateWeightBatch("质押平仓", list);
    }

    @Override
    public String fileNameRegex() {
        return "^(table_weight_质押平仓)*(.csv)$";
    }
}
