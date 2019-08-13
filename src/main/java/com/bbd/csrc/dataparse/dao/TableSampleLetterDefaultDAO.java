package com.bbd.csrc.dataparse.dao;

import com.bbd.csrc.dataparse.domain.TableSampleLetterDefault;
import org.springframework.stereotype.Repository;

/**
 * TableSampleLetterDefaultDAO继承基类
 */
@Repository
public interface TableSampleLetterDefaultDAO extends MyBatisBaseDao<TableSampleLetterDefault, Integer> {

    void truncateTable();
}