package com.ism.Repository.db;

import java.sql.ResultSet;

import com.ism.Repository.list.IRepository;
import com.ism.entities.Medecin;

public interface IMedecinRepository extends IRepository<Medecin> {
    Medecin convertDB(ResultSet rs);

    Medecin selectBySurname(String value);
}
