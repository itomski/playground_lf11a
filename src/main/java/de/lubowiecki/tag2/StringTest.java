package de.lubowiecki.tag2;

import javax.swing.*;

public class StringTest {

    public static void main(String[] args) {

        String s1 = "Hallo String"; // Literale landen im String-Literal-Pool

        String s2 = new String("Hallo String"); // Landet nicht im Pool
        String s3 = "Hallo String"; // Zeigt auf das bereits vorhadene Objekt im Pool

        System.out.println(s1 == s2); // == Referenzvergleich (Ist es das gleiche Objekt auf dem Heap?)
        System.out.println(s1 == s3);

        System.out.println();

        System.out.println(s1.equals(s2)); // equals = Wertevergleich (Hat es den gleichen Wert?)
        System.out.println(s1.equals(s3));

        s3 = "Hallo was anderes"; // Ändert nur s3

        System.out.println();

        String text = "Das ist das Haus von Nikigraus!";
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.charAt(0));
        System.out.println(text.substring(5));
        System.out.println(text.substring(5, 10));

        System.out.println("A".compareTo("A"));

        System.out.println("2" + 2); // Verkettung, wenn einer der Operanden String ist
        System.out.println(Integer.parseInt("2") + 2); // Addition

        System.out.println();

        var zahl = JOptionPane.showInputDialog(null, "Gib eine Zahl ein");
        System.out.println(Integer.parseInt(zahl) + 10);

    }
}
