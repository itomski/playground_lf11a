package de.lubowiecki.tag3;

public class ArrayTest2 {

    public static void main(String[] args) {

        String[] vornamen = {"Peter", "Bruce", "Natasha", "Steve", "Tony", "Carol", "Scott"};
        String[] nachnamen = {"Parker", "Banner", "Romanov", "Rogers", "Stark", "Danvers", "Lang"};

        var randVorname = DiceCup.roll(7);
        var randNachname = DiceCup.roll(7);;

        System.out.println(vornamen[randVorname] + " " + nachnamen[randNachname]); // Alle Arrays beginnen bei 0

    }
}
