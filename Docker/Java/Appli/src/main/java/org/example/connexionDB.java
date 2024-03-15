package org.example;

import java.sql.*;

public class connexionDB {
    static String url = "jdbc:mysql://localhost:3306/my_database";
    static String utilisateur = "root";
    static String motDePasse = "root";

    static Connection connexion = null;

    public static Connection connexion() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);

            System.out.println("Connexion réussie !");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC non trouvé : " + e.getMessage());
        } catch (
                SQLException e) {
            System.out.println("Erreur lors de la connexion à la base de données : " + e.getMessage());
        }
        return connexion;
    }

}
