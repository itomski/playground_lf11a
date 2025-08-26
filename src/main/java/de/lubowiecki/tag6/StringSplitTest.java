package de.lubowiecki.tag6;

public class StringSplitTest {

    public static void main(String[] args) {
        String eingabe = "<<<<r<<<";

        String[] zeichen = eingabe.trim().toLowerCase().split(""); // Nach jedem Zeichen
        for(String z : zeichen) {
            System.out.println(z);
        }
    }
}
