package de.lubowiecki.tag8.orm;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonalCrud implements Crud<Person> {

    private static final String TABLE = "personal";

    @Override
    public List<Person> find() throws SQLException {

        try(Connection connection = DBUtils.getConnection(); // Verbindung aufbauen
            Statement stmt = connection.createStatement()) {

            ResultSet results = stmt.executeQuery("SELECT * FROM " + TABLE); // Anfrage absetzen
            List<Person> personen = new ArrayList<>();

            while(results.next()) { // Relationale Daten in Objekte umwandeln
                personen.add(fill(results));
            }
            return personen;
        }
    }

    @Override
    public Person find(int id) throws SQLException {
        return null;
    }

    @Override
    public boolean insert(Person obj) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Person obj) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Person obj) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteById(int id) throws SQLException {
        return false;
    }

    @Override
    public Person fill(ResultSet result) throws SQLException {
        Person person = new Person();
        person.setId(result.getInt("id")); // Daten der Spalte werden dem Objekt zugewiesen
        person.setVorname(result.getString("vorname"));
        person.setNachname(result.getString("nachname"));
        person.setGeburtsdatum(result.getDate("geburtsdatum").toLocalDate());
        return person;
    }
}
