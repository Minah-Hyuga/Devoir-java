package com.ism.View;

import com.ism.entities.Client;

public class ClientView extends View<Client> implements IClientView {

    @Override
    public Client saisie() {
        Client client = new Client();
        System.out.print("Entrer le surnom : ");
        client.setSurname(scanner.nextLine());
        System.out.print("Entrez le tel : ");
        client.setTel(scanner.nextLine());
        System.out.print("Entrez l'adresse : ");
        client.setAddresse(scanner.nextLine());
        return client;
    }
}
