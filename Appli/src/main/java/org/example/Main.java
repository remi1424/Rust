package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {


        exempleDAO exempleDAO = new exempleDAO();

        exempleDAO.delete(5);

        System.out.println("affichage de toutes les données");
        exempleDAO.getAll().forEach(personne -> System.out.println(personne.getId() + " " + personne.getNom()));
        System.out.println("affichage de la donnée avec l'id 1");
        System.out.println(exempleDAO.getById(1).getNom());

        System.out.println("ajout d'une personne");

        personneDTO personneAajouter = new personneDTO();
        personneAajouter.setId(5);
        personneAajouter.setNom("Doe");
        personneAajouter.setPrenom("John");
        personneAajouter.setAge(30);
        personneAajouter.setProfession("Developpeur");
        personneAajouter.setCode_postal(75000);
        exempleDAO.insert(personneAajouter);

        exempleDAO.getAll().forEach(personne -> System.out.println(personne.getId() + " " + personne.getNom()));
        
        System.out.println("suppression de la personne avec l'id 5");

        exempleDAO.delete(5);

        exempleDAO.getAll().forEach(personne -> System.out.println(personne.getId() + " " + personne.getNom()));




    }
}