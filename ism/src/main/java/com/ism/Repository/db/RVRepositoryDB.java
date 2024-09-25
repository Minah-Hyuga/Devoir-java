package com.ism.Repository.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ism.entities.RV;

public class RVRepositoryDB extends RepositoryImpl<RV> {

    public RVRepositoryDB() {
        this.ouvrir();
        this.table = "rv";
    }

    @Override
    public void insert(RV rv) {
        String sql = String.format("INSERT INTO %s (`id`, `date`, `heure`,`medecin`) VALUES ('%s', '%s', '%s', '%s')",
                table,
                rv.getId(),
                rv.getDate(),
                rv.getHeure());
        super.executeUpdate(sql);
    }

    @Override
    public List<RV> selectAll() {
        List<RV> list = new ArrayList<>();
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

    public RV convertDB(ResultSet rs) {
        RV rv = null;
        try {
            rv = new RV();
            rv.setId(rs.getString("id"));
            rv.setDate(rs.getString("date"));
            rv.setHeure(rs.getString("heure"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rv;
    }

}
