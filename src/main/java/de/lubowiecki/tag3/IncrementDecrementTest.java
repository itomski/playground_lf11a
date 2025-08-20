package de.lubowiecki.tag3;

public class IncrementDecrementTest {

    public static void main(String[] args) {

        var i = 10;
        // i = 100f; // Error: i ist ein int
        i++; // i = (int)(i + 1);
        System.out.println(i);
        System.out.println(++i); // Erhöhung vor der Ausgabe
        System.out.println(i++); // Erhöhung nach der Ausgabe
        System.out.println(i);

        i = 0;
        //        1 + 1   +   3
        int j = ++i + i++ + ++i;
        System.out.println(j);

        i = 0;
        j = i++ + 10;

        i = 0;
        i = i++; // die Variable i wird neu zugewiesen, das postfix geht verloren
    }
}
