package de.lubowiecki.tag3;

import java.util.Scanner;

public class WhileTest {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

//        boolean exit = false;
//
//        while(!exit) { // solange exit false ist...
//
//            System.out.print("#: ");
//            String eingabe = SCANNER.nextLine().trim();
//            System.out.println("Eingabe: " + eingabe);
//
//            if(eingabe.equalsIgnoreCase("exit")) exit = true;
//        }
//
//        System.out.println("Programm wird beendet!");
//
//        System.out.println();

//        app: while(true) {
//
//            System.out.print("#: ");
//            String eingabe = SCANNER.nextLine().trim().toLowerCase();
//
//            switch (eingabe) {
//                case "liste" -> System.out.println("Produktliste");
//                case "new" -> System.out.println("Neues Produkt erfassen");
//                case "exit" -> {
//                    break app;
//                }
//            }
//        }
//
//        System.out.println("Programm wird beendet!");


        String eingabe = null;
        do {

            System.out.print("#: ");
            eingabe = SCANNER.nextLine().trim().toLowerCase();

            switch (eingabe) {
                case "liste" -> System.out.println("Produktliste");
                case "new" -> System.out.println("Neues Produkt erfassen");
            }
        } while(!eingabe.equals("exit"));

        System.out.println("Programm wird beendet!");


    }
}
