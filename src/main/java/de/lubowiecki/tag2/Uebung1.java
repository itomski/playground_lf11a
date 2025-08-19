package de.lubowiecki.tag2;

import java.util.Scanner;

public class Uebung1 {

    // Schreibe ein Programm für einen Taschenrechner
    // Frage den User nach zwei Zahelen.
    // Gibt die Summe beider Zahelen aus


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        //int a = Integer.parseInt(scanner.next());
        double a = scanner.nextDouble();

        System.out.print("B: ");
        //int b = Integer.parseInt(scanner.next());
        double b = scanner.nextDouble();

        System.out.printf("\nSumme: %.2f", (a + b));
    }

}
