package de.lubowiecki.tag3;

public class LogicOpsTest {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        System.out.println(a & b); // AND: true, wenn beide true
        System.out.println(a | b); // OR: true, wenn mind. einer von beiden true
        System.out.println(a ^ b); // XOR: true, wenn nur einer von beiden true

        int alter = 32;

        if(alter > 12 & alter < 25) { // es werden immer beide seiten geprüft
            System.out.println("Treffer 1!");
        }

        if(alter > 12 && alter < 25) { // rechte seite wird nur geprüft, wenn linke true ist
            System.out.println("Treffer 2!");
        }

        String name = null;

//        if(name != null & name.length() > 1) { // wenn name null, dann eine NullPointerException
//            System.out.println("Treffer 3!");
//        }

        if(name != null && name.length() > 1) {
            System.out.println("Treffer 4!");
        }

        System.out.println(!true); // Nicht true = false
    }
}
