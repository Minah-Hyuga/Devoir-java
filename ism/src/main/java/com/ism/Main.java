package com.ism;

import java.util.Scanner;

import com.ism.Repository.list.ClientRepository;
import com.ism.Repository.list.IRepository;
import com.ism.Repository.list.UserRep;
import com.ism.Services.ClientService;
import com.ism.Services.IClientSer;
import com.ism.Services.IUserService;
import com.ism.Services.UserService;
import com.ism.View.ClientView;
import com.ism.View.IClientView;
import com.ism.View.IView;
import com.ism.View.UserView;
import com.ism.View.View;
import com.ism.entities.User;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        View.setScanner(scanner);
        int choice;
        ClientRepository clientRep = new ClientRepository();
        IClientSer clientService = new ClientService(clientRep);
        IClientView clientView = new ClientView();

        IRepository<User> userRep = new UserRep();
        IUserService userService = new UserService(userRep);
        IView<User> userView = new UserView();

        do {
            choice = menu();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    clientService.create(clientView.saisie());
                    break;
                case 2:
                    clientView.afficher(clientService.getAll());
                    break;
                case 3:
                    userService.create(userView.saisie());
                    break;
                case 4:
                    userView.afficher(userService.getAll());
                    break;
                default:
                    break;
            }
        } while (choice != 5);
        System.out.println("Hello world!");

    }

    public static int menu() {
        System.out.println("1- Créer un client");
        System.out.println("2- Lister les clients");
        System.out.println("3- Créer un utilisateurs");
        System.out.println("4- LIster les utilisateurs");
        System.out.println("5- Quitter");
        System.out.print("Faites votre choix : ");
        return scanner.nextInt();
    }

}