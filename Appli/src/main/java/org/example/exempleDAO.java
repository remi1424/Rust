package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class exempleDAO implements personneDAO {
    Connection connexion = null;

    public exempleDAO() throws SQLException {
    }

    @Override
    public List<personneDTO> getAll() throws SQLException {
        this.connexion = connexionDB.connexion();

        Statement statement = connexion.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM personnes");

        List<personneDTO> liste = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nom = resultSet.getString("nom");
            personneDTO personne = new personneDTO();
            System.out.println("id : " + id + " nom : " + nom);
            personne.setId(id);
            personne.setNom(nom);
            liste.add(personne);
        }
        connexion.close();
        return liste;
    }

    @Override
    public personneDTO getById(int id) {
        return null;
    }

    @Override
    public void insert(personneDTO personne) {

    }

    @Override
    public void update(personneDTO personne) {

    }

    @Override
    public void delete(int id) {

    }
}
