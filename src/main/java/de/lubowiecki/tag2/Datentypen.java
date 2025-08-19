package de.lubowiecki.tag2;

public class Datentypen {

    // static = Klassenmethode. Methode wird direkt auf dem Bauplan/Klasse ausgeführt
    public static void main(String[] args) {

        Datentypen dt = new Datentypen(); // Instanz/Objekt
        dt.doSomething(); // Aufruf einer Instanzmethode

        Datentypen.doSomethingElse(); // Aufruf direkt auf der Klasse

        System.out.println();

        // Primitive Datentypen

        int zahl; // Deklaration
        zahl = 100; // Initialisierung = Erste Wertzuweisung
        zahl = 25; // Wertänderung

        // byte < short < int < long < float < double
        //         char <
        // boolean
        // null

        // int ist Standard für Ganzzahlen
        // double ist Standard für Fließkommazahlen

        // Referenzdatentypen
        // Komplexe-Datentypen = Basieren auf Klassen
        // String, Robot, Person

        dt = null;
        String s = "Hallo String";

        // Ganzzahlen

        byte z1 = 100;
        //byte sum = z1 + 5; // 105: Alle Arth. Operationen führen zu einer Konvertierung auf int

        long z2 = 100; // Kleinere Werte konvertieren automatisch zu größeren Typen
        // byte z3 = 300; // Error: Werte können nicht automatisch verkleinert werden
        byte z3 = (byte)300; // Durch ein Cast kann man eine Konvertierung erzwingen
        System.out.println(z3);

        //float f1 = 100.0; // Error: 100.0 ist ein double
        float f1 = 100.0f; // Ok

        int x = 100; // Deklaration und Initialisierung
        int a, b = 200, c = 100;


    }

    // Instanzmethode (nicht static). Für die Ausführung der Methode wird einb Objekt benötigt
    public void doSomething() {
        System.out.println("Instanzmethode");
    }

    // Klassenmethode
    public static void doSomethingElse() {
        System.out.println("Klassenmethode");
        // doSomethingElse(); // Rekursiver Aufruf von sich selbst
    }
}
