package com.ism.Services;

import java.util.List;

import com.ism.entities.Client;

public interface IClientSer {
    void create(Client value);

    List<Client> getAll();

}
