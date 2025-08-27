package de.lubowiecki.tag8.orm;

import java.sql.SQLException;

public class CrudTest {

    public static void main(String[] args) {

        PersonalCrud crud = new PersonalCrud();

        try {
            for (Person p : crud.find()) {
                System.out.println(p.getVorname() + " " + p.getNachname());
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
