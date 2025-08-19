package de.lubowiecki.tag2;

public class StringTest2 {

    public static void main(String[] args) {

        String s = "Das ist das Haus von Nikigraus!";
        System.out.println(s);
        // Strings sind in Java nicht veränderbar
        s.toLowerCase();
        System.out.println(s);
        s = s + "...";

    }
}
