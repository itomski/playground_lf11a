package de.lubowiecki.tag8;

import java.sql.*;

public class ExceptionTest2 {

    public static void main(String[] args) {

        final String URL = "jdbc:mysql://localhost:8889/dbtest";

        // try-with-resources
        try(Connection connection = DriverManager.getConnection(URL, "root", "root"); // Verbindung
            Statement stmt = connection.createStatement()) { // Statement

            System.out.println("Verbindung steht!");
            // connection wird automatisch geschlossen

//            // Lesen
//            ResultSet results = stmt.executeQuery("SELECT * FROM personal"); // SQL
//            while(results.next()) {
//                System.out.println(results.getInt("id"));
//                System.out.println(results.getString("vorname")); // Spalte abfragen
//                System.out.println(results.getString("nachname"));
//                System.out.println(results.getDate("geburtsdatum"));
//                System.out.println();
//            }

            // Einfügen
            //String sql = "INSERT INTO personal (vorname, nachname, geburtsdatum) VALUES('Scott', 'Lang', '1989-10-05')";

            // Ändern
            String sql = "UPDATE personal SET vorname = 'Bruce', nachname='Banner' WHERE id = 2";

            if(stmt.executeUpdate(sql) > 0) {
                System.out.println("Gespeichert!");
            }
            else {
                System.out.println("Problem beim Speichern.");
            }
        }
        catch (SQLException e) {
            System.out.println("Probleme beim Verbinden mit der Datenbank.");
            e.printStackTrace();
        }
    }
}
