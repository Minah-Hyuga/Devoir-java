package com.ism.Repository.db;

import java.sql.ResultSet;

import com.ism.Repository.list.IRepository;
import com.ism.entities.RV;

public interface IRVRepository extends IRepository<RV> {
    RV convertDB(ResultSet rs);
}
