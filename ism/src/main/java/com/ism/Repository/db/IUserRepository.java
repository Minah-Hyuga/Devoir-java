package com.ism.Repository.db;

import java.sql.ResultSet;

import com.ism.Repository.list.IRepository;
import com.ism.entities.User;

public interface IUserRepository extends IRepository<User> {
    User convertDB(ResultSet rs);
}
