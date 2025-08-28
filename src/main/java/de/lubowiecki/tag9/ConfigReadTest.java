package de.lubowiecki.tag9;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReadTest {

    public static void main(String[] args) {

        Properties props = new Properties();

//        try(FileInputStream in = new FileInputStream("config.properties")) {
//            props.load(in);
//        }
//        catch (IOException e) {
//            System.out.println("Problem beim Lesen.");
//        }

        try(FileInputStream in = new FileInputStream("config.xml")) {
            props.loadFromXML(in);
        }
        catch (IOException e) {
            System.out.println("Problem beim Lesen.");
        }

        System.out.println(props.getProperty("db.url"));
        System.out.println(props.getProperty("db.port"));
        System.out.println(props.getProperty("db.name"));
        System.out.println(props.getProperty("db.user"));
        System.out.println(props.getProperty("db.password"));
        System.out.println(props.getProperty("db.driver", "default"));


    }
}
