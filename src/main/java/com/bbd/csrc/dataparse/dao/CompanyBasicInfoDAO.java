package com.bbd.csrc.dataparse.dao;

import com.bbd.csrc.dataparse.domain.CompanyBasicInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * CompanyBasicInfoDAO继承基类
 */
@Repository
public interface CompanyBasicInfoDAO extends MyBatisBaseDao<CompanyBasicInfo, String> {

    String queryQyxxIdByName(String companyName);

    int updateBatchByStockCode(@Param("list") List<CompanyBasicInfo> list);
}