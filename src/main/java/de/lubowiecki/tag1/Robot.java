package de.lubowiecki.tag1;

/**
 * Bla bla bla...
 */
public class Robot {

    // Datentypen
    // int = Ganzzahl
    // String = Zeichenkette

    String name;

    String typ;

    int posX;

    int posY;

    // Methode liefert nichts zurück
    // Methoden sind Funktionen, die zu einer Klasse gehören

    /**
     * Bewegt den Roboter an eine gewählte x/y Position
     * @param x neue Position auf Längstachse
     * @param y neue Position auf Querachse
     */
    public void move(int x, int y) {
        posX = x;
        posY = y;
    }

    /**
     * Gibt Informationen über das Objekt auf der Konsole aus
     */
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Typ: " + typ);
        System.out.println("Position: x " + posX + ", y " + posY);
        System.out.println(); // Leerzeile
    }
}

// Funktionen sind Einheiten von Anweisungen, die am Stück ausgeführt werden.
// Freie Funktionen gibt es iun Java nicht!

/*
// Definition
function machWas() {
    //...
}

machWas(); // Aufruf
*/