package de.lubowiecki.tag3;

import java.util.Random;
import java.util.Scanner;

public class DiceCup {

    // Muss auch in anderen Methoden sichtbar sein
    static final Random rand = new Random();
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String check = null;

        do {
            System.out.print("\nAnzahl: ");
            int anzahl = scanner.nextInt();
            System.out.print("Augen: ");
            int augen = scanner.nextInt();

            int[] sammlung = roll(anzahl, augen);
            print(sammlung);

            System.out.print("Noch ein weiteres mal? ");
            check = scanner.next().trim().toLowerCase();

        } while(check.equals("ja"));
    }

    // Ein Würfel wird geworfen
    public static int roll(int augen) {
        return rand.nextInt(augen) + 1;
    }

    // Mehrer Würfel werden geworfen
    public static int[] roll(int anzahl, int augen) {
        int[] sammlung = new int[anzahl]; // Leeres Array mit 100 Positionen
        for (int i = 0; i < sammlung.length; i++) {
            sammlung[i] = roll(augen); // Array wird mit Werten befüllt
        }
        return sammlung;
    }

    public static void print(int[] wuerfeln) {
        // Inhalt des Array anzeigen
        for(int wert : wuerfeln) {
            System.out.println(wert);
        }
    }

}
