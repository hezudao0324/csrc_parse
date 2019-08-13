package com.bbd.csrc.dataparse.dao;

import com.bbd.csrc.dataparse.domain.TableSamplePledgeLiquidated;
import org.springframework.stereotype.Repository;

/**
 * TableSamplePledgeLiquidatedDAO继承基类
 */
@Repository
public interface TableSamplePledgeLiquidatedDAO extends MyBatisBaseDao<TableSamplePledgeLiquidated, Integer> {

    void truncateTable();
}