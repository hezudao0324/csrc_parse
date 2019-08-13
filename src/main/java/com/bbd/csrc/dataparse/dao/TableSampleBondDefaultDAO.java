package com.bbd.csrc.dataparse.dao;

import com.bbd.csrc.dataparse.domain.TableSampleBondDefault;
import org.springframework.stereotype.Repository;

/**
 * TableSampleBondDefaultDAO继承基类
 */
@Repository
public interface TableSampleBondDefaultDAO extends MyBatisBaseDao<TableSampleBondDefault, Integer> {

    TableSampleBondDefault queryByCompanyName(String companyName);

    void updateByCompanyName(TableSampleBondDefault tableSampleBondDefault);

    void truncateTable();

}