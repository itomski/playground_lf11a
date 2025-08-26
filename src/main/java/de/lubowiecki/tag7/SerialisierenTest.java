package de.lubowiecki.tag7;

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SerialisierenTest {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final DateTimeFormatter DATE_TIME_FMT = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

    private static final String KEYS = "\n---------------------------------------" +
                                        "\n 1: Neues Produkt" +
                                        "\n 2: Produktliste" +
                                        "\n 3: Sortierte Ausgabe" +
                                        "\n 0: Programm beenden" +
                                        "\n---------------------------------------";

    private static final String PRODUCT_ROW_TPL = "| %15s | %15s | %15s | %5s | %6s | \n";

    private static final List<Produkt> PRODUKTE = new ArrayList<>();

    private static final String DB_FILE = "produkte.ser";

    public static void main(String[] args) {

        readFromFile(); // Altdaten einlesen

        app: while(true) {
            System.out.println(KEYS);
            System.out.print("Eingabe: ");
            int auswahl = SCANNER.nextInt();

            switch(auswahl) {
                case 1 -> createProduct();
                case 2 -> showProduct();
                case 3 -> showProductSorted();
                case 0 -> {
                    break app;
                }
                default -> System.out.println("Falsche Eingabe.");
            }
        }

        System.out.println("Programm wird beendet!");
    }

    public static void createProduct() {
        System.out.println("Neues Produkt");
        Produkt produkt = new Produkt();

        SCANNER.nextLine(); // Fix

        System.out.print("Name: ");
        produkt.setName(SCANNER.nextLine());
        System.out.print("Beschreibung: ");
        produkt.setBeschreibung(SCANNER.nextLine());
        System.out.print("Menge: ");
        produkt.setMenge(SCANNER.nextInt());
        System.out.print("Preis: ");
        produkt.setPreis(SCANNER.nextDouble());
        PRODUKTE.add(produkt);
        saveToFile(); // Serialisierte Daten updaten
        System.out.println("Produkt wurde gespeichert.");
    }

    public static void showProduct() {
        print(PRODUKTE);
    }

    public static void showProductSorted() {
        List<Produkt> copy = new ArrayList<>(PRODUKTE);
        Collections.sort(copy);
        print(copy);
    }

    private static void print(List<Produkt> liste) {
        System.out.println("Produktliste");
        System.out.printf(PRODUCT_ROW_TPL, "DATUM", "NAME", "BESCHREIBUNG", "MENGE", "PREIS");
        for(Produkt p : liste) {
            System.out.printf(PRODUCT_ROW_TPL, p.getErzeugtAm().format(DATE_TIME_FMT), p.getName(), p.getBeschreibung(), p.getMenge(), p.getPreis());
        }
    }

    private static void saveToFile() {

        try(FileOutputStream fos = new FileOutputStream(DB_FILE); // Schreibt Text in eine Datei
            ObjectOutputStream oos = new ObjectOutputStream(fos)) { // Schreibt Objekte in eine Datei
            oos.writeObject(PRODUKTE);
            // geöffnete Resourcen werden automatisch geschlossen
        }
        catch (IOException e) {
            System.out.println("Probleme beim Speichern.");
        }
    }

    private static void readFromFile() {

        try(FileInputStream fis = new FileInputStream(DB_FILE); // Liest Text aus einer Datei
            ObjectInputStream ois = new ObjectInputStream(fis)) { // Liest Objekte aus einer Datei
            List<Produkt> altDaten = (List<Produkt>) ois.readObject(); // Altdaten einlesen
            if(altDaten instanceof List<Produkt>) { // Wenn Altdaten das richtige Format haben...
                PRODUKTE.addAll(altDaten); // ...dann die Daten nutzen
            }
            // geöffnete Resourcen werden automatisch geschlossen
        }
        catch (Exception e) {
            System.out.println("Probleme beim Lesen.");
        }

    }
}
