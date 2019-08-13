package com.bbd.csrc.dataparse.dao;

import com.bbd.csrc.dataparse.domain.DibSharesActualController;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * DibSharesActualControllerDAO继承基类
 */
@Repository
public interface DibSharesActualControllerDAO extends MyBatisBaseDao<DibSharesActualController, Integer> {

    List<DibSharesActualController> selectBySecCode(@Param("secCode") String secCode,
                                                    @Param("reportDate") String reportDate);

    List<String> selectSecCodeGroupBySecCode(@Param("reportDate") String reportDate);
}