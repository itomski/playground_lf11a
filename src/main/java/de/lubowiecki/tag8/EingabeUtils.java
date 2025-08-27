package de.lubowiecki.tag8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EingabeUtils {

    private static final Scanner scanner = new Scanner(System.in);

    private EingabeUtils() {
    }

    public static int zahlEingeben(String label, String alert) {
        while(true) {
            try {
                System.out.print(label);
                return scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println(alert);
                scanner.nextLine(); // Fix
            }
        }
    }
}
