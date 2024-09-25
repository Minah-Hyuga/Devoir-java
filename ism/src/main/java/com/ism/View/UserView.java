package com.ism.View;

import com.ism.entities.User;

public class UserView extends View<User> {

    @Override
    public User saisie() {
        User user = new User();
        System.out.println("Entrer le login");
        user.setLogin(scanner.nextLine());
        System.out.println("Entrer le mot de passe");
        user.setPassword(scanner.nextLine());
        System.out.println("Entrer le mail");
        user.setEmail(scanner.nextLine());
        return user;
    }

}
