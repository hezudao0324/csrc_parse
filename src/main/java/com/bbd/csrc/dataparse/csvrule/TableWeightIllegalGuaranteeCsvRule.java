package com.bbd.csrc.dataparse.csvrule;

import com.bbd.csrc.dataparse.domain.TableWeightIllegalGuarantee;
import com.bbd.csrc.dataparse.service.AnalyIndexConfigDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 违规担保
 * Created by hyf on 2019-03-21.
 */
@Component
@Slf4j
public class TableWeightIllegalGuaranteeCsvRule implements CsvRule<TableWeightIllegalGuarantee> {

    @Autowired
    AnalyIndexConfigDataService analyIndexConfigDataService;

    public void beforeDeal(){
        log.info(">>>>>>>>>>>>>> 开始解析(权重)违规担保");
    }

    @Override
    public void afterDeal() {
        log.info(">>>>>>>>>>>>> 解析(权重)违规担保成功");
    }

    @Override
    public void dealWithResult(List<TableWeightIllegalGuarantee> list) {
        analyIndexConfigDataService.updateWeightBatch("违规担保", list);
    }

    @Override
    public String fileNameRegex() {
        return "^(table_weight_违规担保)*(.csv)$";
    }


}
