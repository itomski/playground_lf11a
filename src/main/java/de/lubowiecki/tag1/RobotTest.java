package de.lubowiecki.tag1;

// Klassen aus anderen Packages MÜSSEN importiert werden
// Alle Klassen auf dem Package java.lang sind automatisch verfügbar= müssen NICHT importiert werden

import java.util.Date;

public class RobotTest {

    public static void main(String[] args) {
        // Test für den Roboter

        // Klasse = Bauplan
        // Objekte sind konkrete Vertreter einer Klasse
        Robot r2d2 = new Robot(); // Objekt wird erzeugt (Instanzierung)
        r2d2.name = "R2D2";
        r2d2.typ = "Astromech";
        r2d2.printInfo();

        r2d2.move(10, 15);
        r2d2.printInfo();

        Robot c3po = new Robot();
        c3po.name = "C3PO";
        c3po.typ = "Protokol Droide";
        c3po.printInfo();

        Date heute = new Date();
        System.out.println(heute);

    } // Ende des Programms
}
