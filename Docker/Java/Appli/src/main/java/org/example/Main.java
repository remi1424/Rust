package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        exempleDAO exempleDAO = new exempleDAO();
        //exempleDAO.getAll().forEach(personne -> System.out.println(personne.getId() + " " + personne.getNom()));
        //System.out.println(exempleDAO.getById(1).getNom());

        exempleDAO.delete(5);

        personneDTO personneAajouter = new personneDTO();
        personneAajouter.setId(5);
        personneAajouter.setNom("Doe");
        personneAajouter.setPrenom("John");
        personneAajouter.setAge(30);
        personneAajouter.setProfession("Developpeur");
        personneAajouter.setCode_postal(75000);
        exempleDAO.insert(personneAajouter);

        exempleDAO.getAll().forEach(personne -> System.out.println(personne.getId() + " " + personne.getNom()));




    }
}