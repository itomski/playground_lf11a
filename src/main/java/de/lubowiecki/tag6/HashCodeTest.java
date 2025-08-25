package de.lubowiecki.tag6;

public class HashCodeTest {

    public static void main(String[] args) {

        String str1 = "Hallo String"; // Im String Pool
        String str2 = new String("Hallo String"); // Nicht im String Pool
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println(str1);

        Person p1 = new Person("Peter", "Parker");
        Person p2 = new Person("Bruce", "Banner");
        Person p3 = new Person("Bruce", "Banner");

        // Jedes Objekt in Java erbt von der Klasse Object
        System.out.println(p1); // Wird zu String konvertiert. Automatisch wird toString ausgeführt
        System.out.println(p1.hashCode());

        System.out.println(p2);
        System.out.println(p2.hashCode());

        System.out.println(p3);
        System.out.println(p3.hashCode());

        // equals und hashCode muss bei eigenen Klassen neu implementiert werden
        // equals und hashCode MÜSSEN auf den gleichen Eigenschaften basieren
        System.out.println(p3.equals(p2));

        // API-Contract: Zwei Objekte die per equals gleich sind
        // MÜSSEN den gleichen HashCode liefern

    }
}
