package com.ism.entities;

import lombok.Data;

@Data
public class Client {
    private String surname;
    private String tel;
    private String addresse;
    private User user;

    public static void add(Client client) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public static void insert(Client client) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }
}
