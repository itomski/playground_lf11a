package de.lubowiecki.tag2;

public class ObjektVsStaticTest {

    public static void main(String[] args) {

        // Instanzen = Konkrete Vertreter, die aus einer Klasse gebaut wurden
        Person p1 = new Person();
        p1.sagHallo(); // Aufruf einer Instanzmethode
        p1.sagHallo("Peter");
        // p1.sagHallo(123); // Error: Keine passende Methode in der Klasse Person gefunden!

        // Klassen = Baupläne
        Verwaltung.sagHallo();
        Verwaltung.sagHallo("Hi", "Steve");

    }
}
