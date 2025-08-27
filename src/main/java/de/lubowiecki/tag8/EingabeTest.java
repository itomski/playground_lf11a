package de.lubowiecki.tag8;

public class EingabeTest {

    public static void main(String[] args) {

        int i = EingabeUtils.zahlEingeben("Deine Eingabe für i: ", "Falsche Eingabe!");
        int j = EingabeUtils.zahlEingeben("Deine Eingabe für j: ", "Falsche Eingabe!");

        System.out.println("Deine Eingabe:" + i);
        System.out.println("Deine Eingabe:" + j);
    }

}
