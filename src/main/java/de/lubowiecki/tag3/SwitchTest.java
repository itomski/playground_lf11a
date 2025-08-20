package de.lubowiecki.tag3;

import java.util.Scanner;

public class SwitchTest {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        // MVC = Model View Controller

        System.out.print("Eingabe: ");
        // trim entfernt Leerzeichen, Tabs und Zeilenumbrüche an beiden Enden
        String eingabe = SCANNER.next().trim().toLowerCase();

        switch (eingabe) {
            case "produkte":
                System.out.println("Produkterfassung...");
                break;

            case "services":
                System.out.println("Services...");
                break;

            case "kontakt":
                System.out.println("Kontakt...");
                break;

            case "kunden":
                System.out.println("Kundenerfassung...");
                break;

            default:
                System.out.println("Falsche Auswahl");
        }

        System.out.println();

        // -> sorgt dafür, dass jeder case automatisch ein break bekommt
        switch (eingabe) {
            case "produkte" -> System.out.println("Produkterfassung...");
            case "services" -> {
                System.out.println("Services...");
                // ... weitere Zeilen für diesen case
            }
            case "kontakt" -> System.out.println("Kontakt...");
            case "kunden" -> System.out.println("Kundenerfassung...");
            default -> System.out.println("Falsche Auswahl");
        }

        System.out.println();

        String output = switch (eingabe) {
            case "produkte" -> "Produkterfassung...";
            case "services" -> "Services...";
            case "kontakt" -> "Kontakt...";
            case "kunden" -> "Kundenerfassung...";
            default -> "Falsche Auswahl";
        };

        System.out.println(output);

        // switch kann nur Ganzzahlen, char, String und ENUMs verarbeiten

        int i = 100;
        switch (i) {
            case 100 -> System.out.println("A");
            case 200 -> System.out.println("B");
            case 300 -> System.out.println("C");
            default -> System.out.println("...");
        };

        char j = 'a';
        switch (j) {
            case 'x' -> System.out.println("A");
            case 'y' -> System.out.println("B");
            case 'z' -> System.out.println("C");
            default -> System.out.println("...");
        };

        // ENUMs
        Wochentag tag = Wochentag.SA;
        switch (tag) {
            case MO -> System.out.println("Arbeitstag 1");
            case DI -> System.out.println("Arbeitstag 2");
            case MI -> System.out.println("Arbeitstag 3");
            case DO -> System.out.println("Arbeitstag 4");
            case FR -> System.out.println("Arbeitstag 5");
            default -> System.out.println("Wochenende");
        }

    }
}
