package de.lubowiecki.tag2;

public class Person {

    // Instanzmethode (nicht statisch)
    public void sagHallo() {
        System.out.println("Hallo!");
    }

    // Die Methode wird überladen
    // Überladen = Eine weitere Version mit einer anderen Parameterliste schreiben
    public void sagHallo(String name) {
        System.out.println("Hallo " + name + "!");
    }
}
