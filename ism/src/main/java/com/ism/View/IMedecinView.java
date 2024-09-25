package com.ism.View;

import java.util.List;

import com.ism.entities.Medecin;

public interface IMedecinView {

    Medecin saisie();

    void afficher(List<Medecin> all);

}
