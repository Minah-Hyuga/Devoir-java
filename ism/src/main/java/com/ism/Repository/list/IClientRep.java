package com.ism.Repository.list;

import com.ism.entities.Medecin;

public interface IClientRep extends IRepository<Medecin> {

    Medecin selectBySurname(String value);

}
