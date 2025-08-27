package de.lubowiecki.tag8;

import java.util.Random;

public class Pilzsuche {

    private final Random RAND = new Random();

    private int[][] spielfeld;

    private int zeilen;
    private int spalten;
    private int anzahlPilze;
    private int anzahlVersuche;

    private int versuche;
    private int gefunden;

    public Pilzsuche(int zeilen, int spalten, int anzahlPilze, int anzahlVersuche) {
        // this.zeilen = Instanzvariable
        // zeilen = lokale Variable
        this.zeilen = zeilen;
        this.spalten = spalten;
        this.anzahlPilze = anzahlPilze;
        this.anzahlVersuche = anzahlVersuche;
        reset();
    }

    public void reset() {
        spielfeld = new int[zeilen][spalten];
        versuche = 0;
        gefunden = 0;
        setzePilze();
    }

    private void setzePilze() {
        for(int i = 0; i < anzahlPilze; i++) {
            setzePilz();
        }
    }

    private void setzePilz() {
        int x = RAND.nextInt(zeilen);
        int y = RAND.nextInt(spalten);

        if(spielfeld[x][y] == 1) {
            setzePilz(); // Neue Position ermitteln
        }
        else {
            spielfeld[x][y] = 1;
        }
    }

    public boolean gameOver() {
        return !(anzahlVersuche > versuche);
    }

    public int getVersuche() {
        return versuche;
    }

    public int getGefunden() {
        return gefunden;
    }

    public boolean suchePilz(int x, int y) {
        versuche++;
        if(spielfeld[x][y] == 1) {
            spielfeld[x][y] = 2;
            gefunden++;
            return true;
        }
        return false;
    }
}
