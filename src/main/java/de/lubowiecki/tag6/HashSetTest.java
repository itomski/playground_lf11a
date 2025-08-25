package de.lubowiecki.tag6;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {

        Set<Person> personen = new HashSet<>();
        personen.add(new Person("Peter", "Parker"));
        personen.add(new Person("Scott", "Lang"));
        personen.add(new Person("Carol", "Danvers"));
        personen.add(new Person("Natasha", "Romanov"));
        personen.add(new Person("Steve", "Rogers"));

        Person gesucht = new Person("Carol", "Danvers");

        System.out.println(personen.contains(gesucht));

    }
}
