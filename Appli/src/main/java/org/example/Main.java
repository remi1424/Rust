package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

    exempleDAO exempleDAO = new exempleDAO();
    exempleDAO.getAll().forEach(personne -> System.out.println(personne.getId() + " " + personne.getNom()));




    }
}