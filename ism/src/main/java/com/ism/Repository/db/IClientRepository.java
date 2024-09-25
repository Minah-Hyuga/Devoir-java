package com.ism.Repository.db;

import java.sql.ResultSet;

import com.ism.Repository.list.IRepository;
import com.ism.entities.Client;

public interface IClientRepository extends IRepository<Client> {
    Client convertDB(ResultSet rs);

    Client selectBySurname(String value);
}
