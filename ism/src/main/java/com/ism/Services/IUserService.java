package com.ism.Services;

import java.util.List;

import com.ism.entities.User;

public interface IUserService {
    void create(User value);

    List<User> getAll();

    void add(User saisie);

    Object selectAll();

}
