package com.ism.entities;

import lombok.Data;

@Data
public class Medecin {
    private String id;
    private String nom;
    private String prenom;
    private RV rv;

    public static void add(Medecin client) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public static void insert(Medecin client) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }
}
