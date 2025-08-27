package de.lubowiecki.tag8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransaktionsTest {

    public static void main(String[] args) {

        final String URL = "jdbc:mysql://localhost:8889/dbtest";

        // try-with-resources
        try(Connection connection = DriverManager.getConnection(URL, "root", "root"); // Verbindung
            Statement stmt = connection.createStatement()) { // Statement

            var name = "Bruce";

            // System.out.printf(VORLAGE, Daten); // gibt eine gefüllte Vorlage auf der Konsole aus
            // String.format(VORLAGE, Daten); // Liefert einen String zurück

            try {
                connection.setAutoCommit(false);
                stmt.execute("UPDATE personal SET vorname = '" + name + "', nachname='Banner' WHERE id = 2");
                stmt.execute("UPDATE personal SET vor_name = 'Carol' WHERE id = 1");
                connection.commit(); // Alle anweisungen zusammen übertragen
            }
            catch(SQLException e) {
                connection.rollback(); // Transaktion zurücksetzen
            }

        }
        catch (SQLException e) {
            System.out.println("Probleme beim Verbinden mit der Datenbank.");
            e.printStackTrace();
        }
    }
}

