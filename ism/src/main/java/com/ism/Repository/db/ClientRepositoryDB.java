package com.ism.Repository.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ism.entities.Client;

public class ClientRepositoryDB extends RepositoryImpl<Client> implements IClientRepository {
    public ClientRepositoryDB() {
        this.ouvrir();
        this.table = "clients";
    }

    @Override
    public void insert(Client client) {
        String sql = String.format("INSERT INTO %s (`nom`, `telephone`, `addresse`) VALUES ('%s', '%s', '%s')",
                table,
                client.getSurname(),
                client.getTel(),
                client.getAddresse());
        super.executeUpdate(sql);
    }

    @Override
    public List<Client> selectAll() {
        List<Client> list = new ArrayList<>();
        String sql = String.format("SELECT * FROM %s;", table);
        try {
            ResultSet rs = super.executeSelect(sql);
            while (rs.next()) {
                list.add(this.convertDB(rs));
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la récupération des données;");
        }
        return list;
    }

    public Client convertDB(ResultSet rs) {
        Client client = null;
        try {
            client = new Client();
            client.setSurname(rs.getString("nom"));
            client.setTel(rs.getString("telephone"));
            client.setAddresse(rs.getString("addresse"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }

    @Override
    public Client selectBySurname(String value) {
        return selectAll().stream()
                .filter(cl -> cl.getSurname().compareTo(value) == 0)
                .findFirst()
                .orElse(null);
    }

}
