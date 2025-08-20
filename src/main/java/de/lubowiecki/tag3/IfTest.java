package de.lubowiecki.tag3;

import java.util.Scanner;

public class IfTest {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        // scanner = null; // Konstante: Neuzuweisung nicht möglich

        System.out.print("Eingabe: ");
        String eingabe = SCANNER.nextLine();

        if(eingabe.length() > 2) {

            if(eingabe.equals("add")) {
                System.out.println("+");
            }
            else if(eingabe.equals("div")) {
                System.out.println("/");
            }
            else if(eingabe.equals("sub")) {
                System.out.println("-");
            }
            else if(eingabe.equals("multi")) {
                System.out.println("*");
            }
            else {
                System.out.println("Falsche Eingabe");
            }
        }
        else {
            System.out.println("Falsche Eingabe");
        }

        // Kurzschreibweise für if-else
                        // WENN                   DANN  SONST
        String output = (eingabe.equals("add")) ? "+" : "unbekannt";
        System.out.println(output);

//        if(true) {
//            System.out.println("...");
//        }
//
//        if(false) {
//            System.out.println("...");
//        }

    }
}