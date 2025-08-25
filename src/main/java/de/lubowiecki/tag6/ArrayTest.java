package de.lubowiecki.tag6;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        String[] namen1 = {"Peter", "Carol", "Bruce"}; // Deklaration und Initialisierung
        System.out.println(namen1);

        String[] namen2 = new String[10]; // Leeres Array mit 10 Positionen
        System.out.println(namen2);

        System.out.println(namen1.length);
        System.out.println(namen2.length);

        for(String name : namen1) {
            System.out.print(name + ", ");
        }

        System.out.println();

        namen2[2] = "Steve";
        namen2[7] = "Carol";
        // namen2[11] = "Scott"; // ArrayIndexOutOfBoundsException: Position im Array nicht verfügbar
        // namen2[-1] = "Scott"; // ArrayIndexOutOfBoundsException: Position im Array nicht verfügbar

        //namen2 = new String[20]; // Alte Referenz zeigt auf ein neues Array

        for(String name : namen2) {
            System.out.print(name + ", ");
        }

        System.out.println();

        // UtilityKlasse für Arrays
        System.out.println(Arrays.toString(namen2));

        namen2 = Arrays.copyOf(namen2, 20); // Baut ein neues Array mit den alten Werten
        System.out.println(Arrays.toString(namen2));


        System.out.println();

        int[][] spielfeld = new int[10][20];

        spielfeld[3][6] = 1;

       for(int[] row : spielfeld) {
           for(int cell : row) {
               System.out.print(cell + " ");
           }
           System.out.println();
       }

       System.out.println();

        spielfeld[1][3] = 1; // Schreiben

        for(int i = 0; i < spielfeld.length; i++) { // Zeilen
            for(int j = 0; j < spielfeld[i].length; j++) {
                System.out.print(spielfeld[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(spielfeld[1][3]); // Lesen
    }
}
