package com.ism.entities;

import lombok.Data;

@Data
public class Dette {
    private String date;
    private int montant;
    private Client client;
}
