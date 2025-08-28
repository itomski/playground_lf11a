package de.lubowiecki.tag9;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadJson {

    public static void main(String[] args) {

        final String FILE_NAME = "config.json";

        // Wenn die Datei im Benutzerordner liegt
        // final String FILE_NAME = System.getProperty("user.home") + "/config.json";

        System.out.println(FILE_NAME);

        var mapper = new ObjectMapper();

        try {
            CollectionType type = mapper.getTypeFactory().constructCollectionType(List.class, Person.class);
            List<Person> personen = mapper.readValue(new FileReader(FILE_NAME), type);
            System.out.println(personen);
        }
        catch(IOException e) {
            System.out.println("Problem beim Lesen");
        }
    }
}
