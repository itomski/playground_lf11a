package de.lubowiecki.tag10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceCupTest {

    @DisplayName("Würfelwurf mit einem W6")
    @RepeatedTest(value = 100, name="Durchgang {currentRepetition} von {totalRepetitions}")
    void rollW6() {
        DiceCup cup = new DiceCup(6);
        int result = cup.roll();
        assertTrue(result > 0 && result <= 6);
    }

    @DisplayName("Würfelwurf mit einem W10")
    @RepeatedTest(value = 100, name="Durchgang {currentRepetition} von {totalRepetitions}")
    void rollW10() {
        DiceCup cup = new DiceCup(10);
        int result = cup.roll();
        assertTrue(result > 0 && result <= 10);
    }
}