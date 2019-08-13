package com.bbd.csrc.dataparse.dao;

import com.bbd.csrc.dataparse.domain.TableSampleIllegalGuarantee;
import org.springframework.stereotype.Repository;

/**
 * TableSampleIllegalGuaranteeDAO继承基类
 */
@Repository
public interface TableSampleIllegalGuaranteeDAO extends MyBatisBaseDao<TableSampleIllegalGuarantee, Integer> {

    void truncateTable();
}