package com.bbd.csrc.dataparse.csvrule;

import com.bbd.csrc.dataparse.dao.KtggDAO;
import com.bbd.csrc.dataparse.domain.Ktgg;
import com.bbd.csrc.dataparse.domain.KtggVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by hyf on 2019-03-28.
 */
@Component
public class KtggCsvRule implements CsvRule<Ktgg> {


    @Autowired
    KtggDAO ktggDAO;

    @Override
    public void afterDeal() {

    }

    @Override
    public void dealWithResult(List<Ktgg> list) {
        for (Ktgg ktgg : list) {
            try {
                ktggDAO.insert(ktgg);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public String fileNameRegex() {
        return "^ktgg.csv$";

    }

}
