package com.bbd.csrc.dataparse.dao;

import com.bbd.csrc.dataparse.domain.PersonBasicInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * PersonBasicInfoDAO继承基类
 */
@Repository
public interface PersonBasicInfoDAO extends MyBatisBaseDao<PersonBasicInfo, Integer> {

    void truncateTable();

    void updateBySecCodeAndName(PersonBasicInfo personBasicInfo);

    PersonBasicInfo selectBySecCodeAndName(@Param("secCode") String secCode, @Param("name") String name);
}