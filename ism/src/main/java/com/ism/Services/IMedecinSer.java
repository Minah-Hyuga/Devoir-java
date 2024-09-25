package com.ism.Services;

import java.util.List;

import com.ism.entities.Medecin;

public interface IMedecinSer {
    void create(Medecin value);

    List<Medecin> getAll();

}
