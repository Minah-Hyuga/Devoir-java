package com.ism.Repository.list;

import com.ism.entities.Client;

public interface IClientRep extends IRepository<Client> {

    Client selectBySurname(String value);

}
