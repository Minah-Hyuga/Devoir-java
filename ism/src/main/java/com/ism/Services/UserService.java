package com.ism.Services;

import java.util.List;

import com.ism.Repository.list.IRepository;
import com.ism.entities.User;

public class UserService implements IUserService {
    private IRepository<User> UserRep;

    // couplage faible

    public UserService(IRepository<User> UserRep) {
        this.UserRep = UserRep;
    }

    @Override
    public void create(User user) {
        UserRep.insert(user);
    }

    @Override

    public List<User> getAll() {
        return UserRep.selectAll();
    }

    @Override
    public void add(User saisie) {
        UserRep.insert(saisie);
    }

    @Override
    public Object selectAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectAll'");
    }
}
