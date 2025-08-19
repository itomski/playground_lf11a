package de.lubowiecki.tag2;

public class VariablenTest {

    static int j = 200; // Klassenvariable = In allen Klassenmethoden (static) sichtbar
    int k = 300; // Instanzvariable = In allen Instanzmethoden (nicht static) sichtbar

    // Instanz- und Klassenvariablen bekommen Defaultwerte
    static int c;

    public static void main(String[] args) {

        int i = 10; // lokale Variable = Nur in dieser Methode sichtbar
        // Am Ende der Methode werden alle lokalen Variablen entfernt

        {
            int b = 200;
        } // Am Ende dieses Blocks wird b entfernt

        int d; // lokale Variablen bekommen KEINE Defaultwerte

        int sum1 = 2 + c;
        // int sum2 = 2 + d; // Error: d muss einen Wert haben

        long l = 100000; // primitive widening von int auf long
        l = 10000000000L;

        int zahl = 100; // Dezimal
        System.out.println(zahl);
        zahl = 0b100; // Binär
        System.out.println(zahl);
        zahl = 0x100; // Hex
        System.out.println(zahl);
        zahl = 0100; // Octal
        System.out.println(zahl);

        System.out.println(Integer.toBinaryString(100));
        System.out.println(Integer.toOctalString(100));
        System.out.println(Integer.toHexString(100));

        byte b1 = 1;
        double sum = b1 + 250 + 7.5;

        int erg1 = b1 + 1; // 1 ist ein int, b1 muss für die Rechnung zu int promovieren

        var x1 = 'A'; // char (1 Zeichen)
        var x2 = "A12"; // String
    }

    public static void machWas(int a) {
        // a ist ein Parameter = lokale Variable = Nur in dieser Methode sichtbar
    }
}
