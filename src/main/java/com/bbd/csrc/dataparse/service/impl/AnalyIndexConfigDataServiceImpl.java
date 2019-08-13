package com.bbd.csrc.dataparse.service.impl;

import com.bbd.csrc.dataparse.dao.AnalyIndexConfigDataDAO;
import com.bbd.csrc.dataparse.domain.AnalyIndexConfigData;
import com.bbd.csrc.dataparse.service.AnalyIndexConfigDataService;
import com.bbd.csrc.dataparse.utils.ReflectHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Created by hyf on 2019-03-22.
 */
@Service
public class AnalyIndexConfigDataServiceImpl<T> implements AnalyIndexConfigDataService<T> {

    @Autowired
    AnalyIndexConfigDataDAO analyIndexConfigDataDAO;


    @Override
    public void updateWeightBatch(String commit, List<T> list) {
        AnalyIndexConfigData analyIndexConfigData = analyIndexConfigDataDAO.queryByComment(commit);
        list.stream().forEach(record -> {
            try {
                Field[] fields = record.getClass().getDeclaredFields();
                for (Field field : fields) {
                    String fieldName = ReflectHelper.getFieldName(field);
                    String fieldValue = ReflectHelper.getValueByFieldName(record, fieldName).toString();
                    analyIndexConfigDataDAO.updateScore(fieldValue, analyIndexConfigData.getType(),
                            analyIndexConfigData.getParentType(), fieldName);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
