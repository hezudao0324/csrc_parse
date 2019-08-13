package com.bbd.csrc.dataparse.dao;

import com.bbd.csrc.dataparse.domain.DibDirectorKeyresume;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * DibDirectorKeyresumeDAO继承基类
 */
@Repository
public interface DibDirectorKeyresumeDAO extends MyBatisBaseDao<DibDirectorKeyresume, Integer> {

    List<DibDirectorKeyresume> selectAll();

    List<DibDirectorKeyresume> selectBySecCode(@Param("secCode") String secCode,
                                               @Param("reportDate") String reportDate);

    List<String> selectSecCodeGroupBySecCode(@Param("reportDate") String reportDate);
}