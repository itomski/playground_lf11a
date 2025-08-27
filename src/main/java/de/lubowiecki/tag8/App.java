package de.lubowiecki.tag8;

import java.util.Scanner;

public class App {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Spielstart");

        Pilzsuche spiel = new Pilzsuche(10, 10, 8, 20);

        while(!spiel.gameOver()) {
            System.out.print("x: ");
            int x = SCANNER.nextInt();
            System.out.print("y: ");
            int y = SCANNER.nextInt();

            if(spiel.suchePilz(x, y)) {
                System.out.println("Gefunden!");
            }
            else {
                System.out.println("Nicht gefunden!");
            }
        }

        System.out.println("Spiel beendet!");
        System.out.println("Versuche: " + spiel.getVersuche());
        System.out.println("Gefunden: " + spiel.getGefunden());
    }
}

/*

PROGRAMM App

    AUSGABE "Spielstart"

    ERSTELLE Object spiel MIT Parametern (zeilen=10, spalten=10, anzahlPilze=8, anzahlVersuche=20)

    SOLANGE spiel.gameOver() == false WIEDERHOLE
        EINGABE x
        EINGABE y

        WENN spiel.pilzSuchen(x, y) == true DANN
            AUSGABE "Gefunden!"
        SONST
            AUSGABE "Nicht gefunden!"
    ENDE SOLANGE

    AUSGABE "Spiel beendet!"
    AUSGABE "Versuche: " + spiel.getVersuche()
    AUSGABE "Gefunden: " + spiel.getGefunden()

ENDE PROGRAMM
*/
