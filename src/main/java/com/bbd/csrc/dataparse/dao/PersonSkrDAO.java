package com.bbd.csrc.dataparse.dao;

import com.bbd.csrc.dataparse.domain.PersonSkr;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * PersonSkrDAO继承基类
 */
@Repository
public interface PersonSkrDAO extends MyBatisBaseDao<PersonSkr, Integer> {

    List<PersonSkr> selectAll();

    List<PersonSkr> selectByYear(@Param("year") String year);
}