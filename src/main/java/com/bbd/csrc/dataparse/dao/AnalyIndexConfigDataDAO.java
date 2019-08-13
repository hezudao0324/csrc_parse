package com.bbd.csrc.dataparse.dao;

import com.bbd.csrc.dataparse.domain.AnalyIndexConfigData;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * AnalyIndexConfigDataDAO继承基类
 */
@Repository
public interface AnalyIndexConfigDataDAO extends MyBatisBaseDao<AnalyIndexConfigData, Integer> {

    AnalyIndexConfigData queryByComment(String commnet);

    void updateScore(@Param("score") String score,
                     @Param("one") Integer one,
                     @Param("parentType") Integer parentType,
                     @Param("name") String name);


}