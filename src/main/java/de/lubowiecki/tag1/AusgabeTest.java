package de.lubowiecki.tag1;

public class AusgabeTest {

    public static void main(String[] args) {

        System.out.println("Mein Name ist \"Peter\"");

        System.out.println("Mein Name ist 'Peter'");

        System.out.println("Mein Name ist \\Peter");

        System.out.println("Mein Name \nist \tPeter");

        System.out.println("Das ist ein € \u1418");

        // Vorlage und Werte
        System.out.printf("Mein Name ist %s \n", "Peter");

        final String PREIS_TPL = "%.2f € \n";
        System.out.println(100.99);
        System.out.printf(PREIS_TPL, 100.99);
        System.out.printf(PREIS_TPL, 0.29);
        System.out.printf(PREIS_TPL, 8.6295);

        final String ROW_TPL = "| %-15s | %-15s | %15s |\n";

        System.out.println("\n*******************************************************");
        System.out.printf(ROW_TPL, "Vorname", "Nachname", "Geburtsdatum");
        System.out.printf(ROW_TPL, "Peter", "Parker", "15.07.1982");
        System.out.printf(ROW_TPL, "Natasha", "Romanov", "01.09.1980");
        System.out.println("*******************************************************");

        final double PI = 3.14;
        System.out.println(PI);
        System.out.println(Math.PI);

    }
}
