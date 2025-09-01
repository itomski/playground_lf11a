package de.lubowiecki.tag10;

import java.util.Scanner;

public class InputUtils {

    public static int parseNumber(String input) {
        return Integer.parseInt(input);
    }

    public static int checkNumber(int nr) {
        if(nr > 0 && nr < 100) {
            return nr;
        }
        else {
            throw new RuntimeException("Zahl passt nicht!");
        }
    }
}
