package com.ism.View;

import java.util.List;

import com.ism.entities.Client;

public interface IClientView {

    Client saisie();

    void afficher(List<Client> all);

}
