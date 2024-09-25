package com.ism.Repository.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ism.Repository.list.IRepository;

public abstract class RepositoryImpl<T> implements IRepository<T> {
    protected Connection conn = null;
    protected String dbName = "ges_medecin";
    protected String user = "root";
    protected String pass = "";
    protected String table;

    public void ouvrir() {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbName, user, pass);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur de chargement du Driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erreur de Connexion à votre BD: " + e.getMessage());
        }
    }

    public void fermer() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de la connexion: " + e.getMessage());
            }
        }
    }

    public ResultSet executeSelect(String req) {
        ResultSet rs = null;
        try {
            Statement statement = conn.createStatement();
            rs = statement.executeQuery(req);
        } catch (SQLException e) {
            System.out.println("Erreur d'exécution de la requête: " + e.getMessage());
        }
        return rs;
    }

    public boolean executeUpdate(String req) {
        int nbr = 0;
        try (Statement statement = conn.createStatement()) {
            nbr = statement.executeUpdate(req);
        } catch (SQLException e) {
            System.out.println("Erreur d'exécution de la requête: " + e.getMessage());
        }
        return nbr > 0;
    }
}
