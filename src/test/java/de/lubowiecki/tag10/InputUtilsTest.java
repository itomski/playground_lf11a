package de.lubowiecki.tag10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputUtilsTest {

    @Test
    void parse1() {
        int result = InputUtils.parseNumber("100");
        int expected = 100;
        assertEquals(expected, result);
    }

    @Test
    void parse2() {
        assertThrows(NumberFormatException.class, () -> {
            InputUtils.parseNumber("xyz");
        });
    }

    @Test
    void check1() {
        assertThrows(RuntimeException.class, () -> {
            InputUtils.checkNumber(500);
        });
    }

    @Test
    void check2() {
        int expected = 80;
        int result = InputUtils.checkNumber(80);
        assertEquals(expected, result);
    }
}