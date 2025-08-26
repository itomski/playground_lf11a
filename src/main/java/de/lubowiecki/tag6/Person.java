package de.lubowiecki.tag6;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {

    private String vorname;
    private String nachname;

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        return vorname + ' ' + nachname;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("EQUALS");
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(vorname, person.vorname) && Objects.equals(nachname, person.nachname);
    }

    @Override
    public int hashCode() {
        System.out.println("HASHCODE");
        return Objects.hash(vorname, nachname);
    }


    // Implementierung der Natürlichen Ordnung
    @Override
    public int compareTo(Person o) {
        return Comparator.comparing(Person::getVorname)
                    .thenComparing(Person::getNachname)
                    // ggfl noch weitere Eigenschaften
                    .compare(this, o);
    }
}
