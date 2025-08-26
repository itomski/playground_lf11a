package de.lubowiecki.tag7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadBigFile {

    public static void main(String[] args) {

        Path pfad = Paths.get("daten.txt");

        try {
//            List<String> zeilen = Files.readAllLines(pfad); // Alle Daten landen im Arbeitsspeicher
//            for(String zeile : zeilen) {
//                System.out.println(zeile);
//            }

            // Streams
            // Alle Daten werden Zeile für Zeile verarbeitet
            Files.lines(pfad)
                    .map(row -> row.toUpperCase())
                    .forEach(row -> System.out.println(row));

        }
        catch (IOException e) {
            System.out.println("Probleme beim Lesen");
        }


    }
}
