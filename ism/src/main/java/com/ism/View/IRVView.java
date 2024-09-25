package com.ism.View;

import java.util.List;

import com.ism.entities.RV;

public interface IRVView {
    RV saisie();

    void afficher(List<RV> all);

}
