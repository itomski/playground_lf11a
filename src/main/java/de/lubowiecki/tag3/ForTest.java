package de.lubowiecki.tag3;

public class ForTest {

    public static void main(String[] args) {

        // Beim Start wird das i auf 0 gesetzt
        // bei jedem Durchlauf wird geprüft, ob i kleiner 10 ist
        // Block wird ausgeführt
        // i wird um 1 erhöht
        for (int i = 0; i < 10;) {
            System.out.println(++i);
        }
        // hier ist KEIN Zugriff auf i mehr möglich

        System.out.println();

        int j = 5;
        for (j = 0; j < 10;) {
            System.out.print(++j);
            if(j == 5) continue; // Springt zum nächsten Durchlauf
            if(j == 8) break; // Schleife wird abgebrochen
            System.out.print("...");
        }
        // hier ist das j immer noch verfügbar

        System.out.println();

        int k = 100; // einfacher Wert
        int[] kArr = {100, 200, 300, 400}; // Sammlung von Werten, 4 int Werte
        char[] chArr = {'x', 'z', 'a', '9', 'o'}; // Sammlung von Werten, 5 chars
        String[] namen = {"Peter", "Carol", "Bruce", "Steve", "Natasha", "Tony"}; // Sammlung von Werten, 6 Strings

        // name = aktueller Wert
        // namen = Sammlung
        for(String name : namen) {
            System.out.println(name);
        }

        for (int i = 0; i < namen.length; i++) {
            System.out.println(namen[i]);
        }
    }
}
