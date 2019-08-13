package com.bbd.csrc.dataparse.dao;

import com.bbd.csrc.dataparse.domain.PersonDjg;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * PersonDjgDAO继承基类
 */
@Repository
public interface PersonDjgDAO extends MyBatisBaseDao<PersonDjg, Integer> {

    List<PersonDjg> selectAll();

    List<PersonDjg> selectByYear(@Param("year") String year);
}