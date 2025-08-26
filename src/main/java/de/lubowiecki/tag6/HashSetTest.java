package de.lubowiecki.tag6;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {

    public static void main(String[] args) {

        Set<Person> personen = new HashSet<>();
        personen.add(new Person("Peter", "Parker"));
        personen.add(new Person("Scott", "Lang"));
        personen.add(new Person("Carol", "Danvers"));
        personen.add(new Person("Natasha", "Romanov"));
        personen.add(new Person("Steve", "Rogers"));

        Person gesucht = new Person("Carol", "Danvers");

        System.out.println();

        System.out.println(personen.contains(gesucht));

        System.out.println();

        personen.add(new Person("Carol", "Danvers"));

        System.out.println(personen);

        System.out.println("SORTIERT:");

        Set<Person> personenSortiert = new TreeSet<>(); // Verlangt sortierbare Objekte
        personenSortiert.add(new Person("Peter", "Parker"));
        personenSortiert.add(new Person("Scott", "Lang"));
        personenSortiert.add(new Person("Carol", "Danvers"));
        personenSortiert.add(new Person("Natasha", "Romanov"));
        personenSortiert.add(new Person("Steve", "Rogers"));

        System.out.println(personenSortiert);
    }
}
