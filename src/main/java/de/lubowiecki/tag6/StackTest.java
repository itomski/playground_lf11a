package de.lubowiecki.tag6;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        // Früher

        Stack<String> namen = new Stack<>();
        namen.push("Peter");
        namen.push("Bruce");
        namen.push("Carol");

        //System.out.println(namen.pop()); // Entfernt und liefert das letzte Element zurück
        //System.out.println(namen.pop());

        while(!namen.isEmpty()) {
            System.out.println(namen.pop());
        }

        System.out.println();

        // Heute
        Deque<String> namen2 = new LinkedList<>();
        namen2.push("Peter");
        namen2.push("Bruce");
        namen2.push("Carol");

        while(!namen2.isEmpty()) {
            System.out.println(namen2.pop());
        }

    }
}
