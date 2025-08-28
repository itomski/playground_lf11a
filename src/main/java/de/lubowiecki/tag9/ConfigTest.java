package de.lubowiecki.tag9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigTest {

    public static void main(String[] args) {

        // Schreiben von Properties
        Properties props = new Properties();
        props.setProperty("db.url", "jdbc:mysql://localhost");
        props.setProperty("db.port", "3306");
        props.setProperty("db.name", "buecherhalle");
        props.setProperty("db.user", "root");
        props.setProperty("db.password", "geheim#123");

//        try(FileOutputStream out = new FileOutputStream("config.properties")) {
//            props.store(out, null);
//        }
//        catch(IOException e) {
//            System.out.println("Problem beim Schreiben");
//        }

        try(FileOutputStream out = new FileOutputStream("config.xml")) {
            props.storeToXML(out, null);
        }
        catch(IOException e) {
            System.out.println("Problem beim Schreiben");
        }
    }
}
