package com.ism.View;

import java.util.List;

import com.ism.entities.User;

public interface IUserView {
    User saisie();

    void afficher(List<User> all);

}
