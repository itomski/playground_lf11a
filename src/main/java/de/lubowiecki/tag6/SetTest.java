package de.lubowiecki.tag6;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {

        // Interface              // Klasse
        Set<Integer> zahlen = new HashSet<>();
        //Set<Integer> zahlen = new Set<>(); // Error: Interaces können nicht instanziert werden

        zahlen.add(10);
        zahlen.add(20);
        zahlen.add(30);
        zahlen.add(200);
        zahlen.add(1000);
        zahlen.add(200); // Duplikat nicht erlaubt

        for(int z : zahlen) System.out.println(z);

        System.out.println(zahlen.contains(30));
        zahlen.remove(30);
    }
}
