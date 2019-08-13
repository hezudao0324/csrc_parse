package com.bbd.csrc.dataparse.dao;

import com.bbd.csrc.dataparse.domain.PersonGd;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * PersonGdDAO继承基类
 */
@Repository
public interface PersonGdDAO extends MyBatisBaseDao<PersonGd, Integer> {

    List<PersonGd> selectAll();

    List<PersonGd> selectByType();

}