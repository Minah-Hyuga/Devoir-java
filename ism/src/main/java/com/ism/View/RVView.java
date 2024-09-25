package com.ism.View;

import com.ism.entities.RV;

public class RVView extends View<RV> {

    @Override
    public RV saisie() {
        RV rv = new RV();
        System.out.println("Entrer l'id du rv");
        rv.setId(scanner.nextLine());
        System.out.println("Entrer la date du rv");
        rv.setDate(scanner.nextLine());
        System.out.println("Entrer l'heure du rv");
        rv.setHeure(scanner.nextLine());
        System.out.println("Entrer le nom du medecin");
        rv.setMedecin(scanner.nextLine());
        return rv;
    }

}
