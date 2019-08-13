package com.bbd.csrc.dataparse.service;

import java.util.List;

/**
 * Created by hyf on 2019-03-22.
 */
public interface AnalyIndexConfigDataService<T> {

    void updateWeightBatch(String commit, List<T> list);
}
