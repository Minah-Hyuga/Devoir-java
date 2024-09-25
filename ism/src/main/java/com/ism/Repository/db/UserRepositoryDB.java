package com.ism.Repository.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ism.entities.User;

public class UserRepositoryDB extends RepositoryImpl<User> {

    public UserRepositoryDB() {
        this.ouvrir();
        this.table = "user";
    }

    @Override
    public void insert(User user) {
        String sql = String.format("INSERT INTO %s (`login`, `email`, `password`) VALUES ('%s', '%s', '%s')",
                table,
                user.getLogin(),
                user.getEmail(),
                user.getPassword());
        super.executeUpdate(sql);
    }

    @Override
    public List<User> selectAll() {
        List<User> list = new ArrayList<>();
        String sql = String.format("SELECT * FROM %s;", table);
        try {
            ResultSet rs = super.executeSelect(sql);
            while (rs.next()) {
                list.add(this.convertDB(rs));
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la récupération des données: ");
        }
        return list;
    }

    public User convertDB(ResultSet rs) {
        User user = null;
        try {
            user = new User();
            user.setLogin(rs.getString("login"));
            user.setEmail(rs.getString("email"));
            user.setPassword(rs.getString("password"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

}
