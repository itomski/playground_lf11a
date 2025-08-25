package de.lubowiecki.tag6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList elemente = new ArrayList(); // Alles wird als Objekt abgelegt
        elemente.add(100); // Integer-Objekt
        elemente.add(100.5f); // Float-Objekt
        elemente.add("Hallo"); // String-Objekt

        for(Object o : elemente) {
            System.out.println(o.toString()); // Besondere Methoden der Objekte sind nicht sichtbar
        }

        System.out.println();

        // Schneller wahlfreier Zugriff
        // Langsam bei Änderungen mittendrin

        ArrayList<String> elemente2 = new ArrayList<>();
        //ArrayList<String> elemente2 = new ArrayList<>(100);
        elemente2.add("Peter"); // nur Strings und seine Unterklassen erlaubt
        elemente2.add("Carol");
        System.out.println(elemente2.size()); // Aktuelle Größe
        elemente2.add("Scott"); // Hinzufügen
        elemente2.add("Natasha");
        System.out.println(elemente2.size()); // Aktuelle Größe
        elemente2.remove(2); // Entfernen
        System.out.println(elemente2.size()); // Aktuelle Größe

        System.out.println();

        System.out.println(elemente2); // List hat eine toString

        System.out.println();

        for(int i = 0; i < elemente2.size() ; i++) {
            System.out.println(elemente2.get(i));
        }

        System.out.println(); // Seit Java 1.5

        for(String s : elemente2) {
            System.out.println(s);
        }

        System.out.println(); // Seit Java 1.8

        elemente2.set(1, "Steve"); // Ersetzen an Position

        elemente2.forEach(s -> System.out.println(s)); // Mit Lambdas
        //elemente2.forEach(System.out::println); // Mit Methodenreferenz

        System.out.println();


        // Langsamer wahlfreier Zugriff
        // Schnell bei Änderungen mittendrin

        LinkedList<Integer> zahlen = new LinkedList<>();
        zahlen.add(10);
        zahlen.add(20);
        zahlen.add(30);
        zahlen.add(40);
        zahlen.remove(0);
        zahlen.set(0, 1000);
        System.out.println(zahlen);

        System.out.println();

        // Links: Referenztyp
        // Rechts: Objekttyp
        List<Integer> zahlen2 = new ArrayList<>();
        zahlen2.add(10);
        zahlen2.add(20);
        zahlen2.add(30);

        // Der Inhalt der Listen wird nicht kopiert
        // Die neue Referenz zeigt auf die alten Objekte
        zahlen2 = new LinkedList<>(zahlen2); // Wechsel von ArrayList auf Linkedlist
        zahlen2.add(0, 100);
        zahlen2.add(2, 700);

        for(int z : zahlen2) {
            System.out.println(z);
        }

        zahlen2 = new ArrayList<>(zahlen2); // Wechsel von Linkedlist auf ArrayList

        System.out.println(zahlen2.get(3));
    }
}
