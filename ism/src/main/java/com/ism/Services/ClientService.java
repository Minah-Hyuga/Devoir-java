package com.ism.Services;

import java.util.List;

import com.ism.Repository.list.IRepository;
import com.ism.entities.Client;

public class ClientService implements IClientSer {
    private IRepository<Client> ClientRep;

    // couplage faible

    public ClientService(IRepository<Client> ClientRep) {
        this.ClientRep = ClientRep;
    }

    @Override
    public void create(Client client) {
        ClientRep.insert(client);
    }

    @Override

    public List<Client> getAll() {
        return ClientRep.selectAll();
    }

}
