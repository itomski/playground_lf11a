package de.lubowiecki.tag8.orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

    private DBUtils() {
    }

    // throws = Aufrufer dieser Methode muss die SQLException behandeln
    public static Connection getConnection() throws SQLException {
        final String URL = "jdbc:mysql://localhost:8889/dbtest";
        return DriverManager.getConnection(URL, "root", "root");
    }
}
