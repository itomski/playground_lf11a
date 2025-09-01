package de.lubowiecki.tag10;

import java.util.Random;

public class DiceCup {

    private final int faces;
    private final Random random = new Random();

    public DiceCup(int faces) {
        this.faces = faces;
    }

    public int roll() {
        return random.nextInt(faces) + 1;
    }
}
