package com.bbd.csrc.dataparse.dao;

import com.bbd.csrc.dataparse.domain.DibSharesMajorShareholderInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * DibSharesMajorShareholderInfoDAO继承基类
 */
@Repository
public interface DibSharesMajorShareholderInfoDAO extends MyBatisBaseDao<DibSharesMajorShareholderInfo, Integer> {

    List<DibSharesMajorShareholderInfo> selectBySecCode(@Param("secCode") String secCode,
                                                        @Param("reportDate") String reportDate);

    List<String> selectSecCodeGroupBySecCode(@Param("reportDate") String reportDate);
}