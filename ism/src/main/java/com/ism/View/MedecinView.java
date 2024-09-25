package com.ism.View;

import com.ism.entities.Medecin;

public class MedecinView extends View<Medecin> implements IMedecinView {

    @Override
    public Medecin saisie() {
        Medecin Medecin = new Medecin();
        System.out.print("Entrer l'id du medecin : ");
        Medecin.setId(scanner.nextLine());
        System.out.print("Entrez le nom du medecin : ");
        Medecin.setNom(scanner.nextLine());
        System.out.print("Entrez le prenom du medecin : ");
        Medecin.setPrenom(scanner.nextLine());
        return Medecin;
    }
}
