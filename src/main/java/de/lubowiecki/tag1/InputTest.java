package de.lubowiecki.tag1;

import javax.swing.*;
import java.util.Scanner;

public class InputTest {


    public static void main(String[] args) {

        // Scanner = Name der Klasse
        // scanner = name der Variable
        // new Scanner() = Objekterzeugung
        Scanner scanner = new Scanner(System.in);

        // System.out = Ausgabe-Strom
        // System.in = Eingabe-Strom

        // EVA = Eingabe, Verarbeitung, Ausgabe

        // Kommandozeile
        System.out.println("Dein Name?");
        String eingabe = scanner.nextLine(); // Zeile einlesen
        System.out.println("Hallo " + eingabe);

        // GUI
        String zweiteEingabe = JOptionPane.showInputDialog("Wie ist dein Name?");
        JOptionPane.showMessageDialog(null, "Hallo " + zweiteEingabe);

        // keine gute Idee!
        String lösung = "2 x 20 = 40";

        // ptimitive Datentypen

        char zeichen = 'X'; // 1 Unicode-Zeichen

        double /* bla bla bla */ preis1 = 10.9;
        float preis2 = 10.9f;

        int zahl1 = 10_000_000;
        long zahl2 = 10_000_000_000l; // l oder L muss dazu
        short zahl3 = 10_000;
        byte zahl4 = 127; // -128 bis +127

        boolean ok = false; // true

        // komplexe Datentypen sind Objekte
    }
}
