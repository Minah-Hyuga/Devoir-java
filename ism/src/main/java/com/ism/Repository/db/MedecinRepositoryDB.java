package com.ism.Repository.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ism.entities.Medecin;

public class MedecinRepositoryDB extends RepositoryImpl<Medecin> implements IMedecinRepository {
    public MedecinRepositoryDB() {
        this.ouvrir();
        this.table = "medecin";
    }

    @Override
    public void insert(Medecin medecin) {
        String sql = String.format("INSERT INTO %s (`id`, `nom`, `prenom`) VALUES ('%s', '%s', '%s')",
                table,
                medecin.getId(),
                medecin.getNom(),
                medecin.getPrenom());
        super.executeUpdate(sql);
    }

    @Override
    public List<Medecin> selectAll() {
        List<Medecin> list = new ArrayList<>();
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

    public Medecin convertDB(ResultSet rs) {
        Medecin medecin = null;
        try {
            medecin = new Medecin();
            medecin.setId(rs.getString("id"));
            medecin.setNom(rs.getString("nom"));
            medecin.setPrenom(rs.getString("prenom"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medecin;
    }

    @Override
    public Medecin selectBySurname(String value) {
        return selectAll().stream()
                .filter(cl -> cl.getId().compareTo(value) == 0)
                .findFirst()
                .orElse(null);
    }

}
