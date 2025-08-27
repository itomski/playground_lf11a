package de.lubowiecki.tag8;

import java.sql.*;

public class PreparedStatementTest {

    public static void main(String[] args) {

        final String URL = "jdbc:mysql://localhost:8889/dbtest";

        // Das SQL wird auf der DB vorkompilert und erwartet nur noch werte
        final String SQL = "INSERT INTO personal (vorname, nachname, geburtsdatum) VALUES(?, ?, ?)";

        try(Connection connection = DriverManager.getConnection(URL, "root", "root");
            PreparedStatement stmt = connection.prepareStatement(SQL)) {

            // Mit PreparedStatements sind SQLInjections NICHT mehr möglich
            // Werte werden NICHT als SQL ausgewertet
            stmt.setString(1, "Hans"); // Platzhalter werden ersetzt
            stmt.setString(2, "Hansen");
            stmt.setString(3, "2012-10-22");
            stmt.execute();

        }
        catch (SQLException e) {
            System.out.println("Probleme beim Verbinden mit der Datenbank.");
            e.printStackTrace();
        }
    }
}
