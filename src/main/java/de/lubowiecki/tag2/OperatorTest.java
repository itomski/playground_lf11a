package de.lubowiecki.tag2;

public class OperatorTest {

    public static void main(String[] args) {

        System.out.println(10 % 2);
        System.out.println(11 % 2);
        System.out.println(7 % 10);
        System.out.println(10 % -3);

        System.out.println(10 + 2 * 5); // Punkt vor Strich
        System.out.println((10 + 2) * 5);

        int x = 7 + 15 * 22; // Zuweisung als letztes

        System.out.println();

        int a = 10;
        int b = 6;

        // a: 00001010
        // b: 00000110
        // e: 00000010
        System.out.println(a & b); // Bit-wise AND

        // a: 00001010
        // b: 00000110
        // e: 00001110
        System.out.println(a | b); // Bit-wise OR

        // a: 00001010
        // b: 00000110
        // e: 00001100
        System.out.println(a ^ b); // Bit-wise XOR

        // Shift
        // a: 00001010
        // e: 00000010
        System.out.println(a >> 2);
        // a: 00001010
        // e: 01010000
        System.out.println(a << 3);

        String s = (a < 15) ? "OK" : "PROBLEM";

        int zahl = 15;
        zahl += 7; // zahl = zahl + 7;

        // 1 += 2; // geht nicht. Zuweisung ist nur auf Variablen möglich

        byte wert1 = 15;
        wert1 += 10; // wert1 = (byte)(wert1 + 10);

        wert1 = 120;
        //wert1 = wert1 + 10; // erg ist ein int
        wert1 += 10; // Überlauf
        System.out.println(wert1);

    }
}
