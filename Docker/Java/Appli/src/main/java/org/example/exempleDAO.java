package org.example;

import java.sql.*;
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
    public personneDTO getById(int _id) throws SQLException {
        this.connexion = connexionDB.connexion();
        personneDTO personne = new personneDTO();

        PreparedStatement statement = connexion.prepareStatement("SELECT * FROM personnes WHERE id = ?");
        statement.setInt(1, _id);

        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            String nom = resultSet.getString("nom");
            personne.setId(_id);
            personne.setNom(nom);
        } else {
            System.out.println("Aucun résultat");
        }

        resultSet.close();
        statement.close();
        connexion.close();

        return personne;
    }


    @Override
    public void insert(personneDTO personne) throws SQLException {
        this.connexion = connexionDB.connexion();

        String sql = "INSERT INTO personnes  VALUES (?,?,?,?,?,?)";

        PreparedStatement statement = connexion.prepareStatement(sql);

        statement.setInt(1, personne.getId());
        statement.setString(2, personne.getNom());
        statement.setString(3, personne.getPrenom());
        statement.setInt(4, personne.getAge());
        statement.setString(5, personne.getProfession());
        statement.setInt(6, personne.getCode_postal());

        statement.executeUpdate();
        statement.close();
        connexion.close();

    }

    @Override
    public void update(personneDTO personne) {

    }

    @Override
    public void delete(int id) throws SQLException {
        this.connexion = connexionDB.connexion();

        String sql = "DELETE FROM personnes WHERE id = ?";

        PreparedStatement statement = connexion.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();

    }
}
