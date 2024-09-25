package com.ism.entities;

import lombok.Data;

@Data
public class RV {
    private String id;
    private String date;
    private String heure;
    private Medecin medecin;

    public void setMedecin(String nextLine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setMedecin'");
    }
}
