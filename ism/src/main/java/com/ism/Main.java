package com.ism;

import java.util.Scanner;

import com.ism.Repository.db.IMedecinRepository;
import com.ism.Repository.db.MedecinRepositoryDB;
import com.ism.Repository.db.RVRepositoryDB;
import com.ism.Repository.list.IRepository;
import com.ism.Services.IMedecinSer;
import com.ism.Services.IRVService;
import com.ism.Services.MedecinService;
import com.ism.Services.RVService;
import com.ism.View.IMedecinView;
import com.ism.View.IView;
import com.ism.View.MedecinView;
import com.ism.View.RVView;
import com.ism.View.View;
import com.ism.entities.RV;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        View.setScanner(scanner);
        int choice;
        IMedecinRepository medecinRep = new MedecinRepositoryDB();
        IMedecinSer medecinService = new MedecinService(medecinRep);
        IMedecinView medecinView = new MedecinView();

        IRepository<RV> rvRep = new RVRepositoryDB();
        IRVService rvService = new RVService(rvRep);
        IView<RV> rvView = new RVView();

        do {
            choice = menu();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    medecinService.create(medecinView.saisie());
                    break;
                case 2:
                    rvService.create(rvView.saisie());
                    break;
                case 3:
                    rvView.afficher(rvService.getAll());
                    break;
                default:
                    break;
            }
        } while (choice != 5);
        System.out.println("Hello world!");

    }

    public static int menu() {
        System.out.println("1- Enregistrer un medecin");
        System.out.println("2- Enregitrer un rendez-vous");
        System.out.println("3- LIster les rendez-vous");
        System.out.println("4- Quitter");
        System.out.print("Faites votre choix : ");
        return scanner.nextInt();
    }

}