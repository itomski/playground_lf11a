package de.lubowiecki.tag10;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TaschenrechnerTest {

    private static Taschenrechner rechner;

    @BeforeAll // Wird einmalig vor dem Start aller Tests ausgeführt
    public static void vorAllen() {
        System.out.println("START");
        rechner = new Taschenrechner();
    }

    @BeforeEach // Wird vor jeder Testmethode ausgeführt
    public void vorJeder() {
        System.out.println("START TEST");
    }

    @AfterAll // Wird einmalig nach der Ausführung aller Tests ausgeführt
    public static void nachAllen() {
        System.out.println("ENDE");
    }

    @AfterEach // Wird nach jeder Testmethode ausgeführt
    public void nachJeder() {
        System.out.println("ENDE TEST");
    }

    @Disabled("Kann aktuell nicht getestet werden")
    @Test
    void add1() {
        double a = 5.0;
        double b = 25.0;
        double expected = 30.0;
        assertEquals(expected, rechner.add(a, b));
    }

    @Test
    void add5() {
        fail("Aktuell nicht implementiert");
    }


    @Test
    void add2() {
//        double a = -5.0;
//        double b = 20.0;
//        double expected = 15.0;
//        assertEquals(expected, rechner.add(a, b));
        assertEquals(15.0, rechner.add(-5.0, 20.0));
    }

    @Test
    void add3() {
        double a = -5.0;
        double b = -20.0;
        double expected = -25.0;
        assertEquals(expected, rechner.add(a, b));
    }

    @Test
    void sub() {
        double a = 5.0;
        double b = 25.0;
        double expected = -20.0;
        assertEquals(expected, rechner.sub(a, b));
    }

    @Test
    void multi1() {
        double a = 2.0;
        double b = 2.0;
        double expected = 4.0;
        assertEquals(expected, rechner.multi(a, b));
    }

    @Test
    void multi2() {
        double a = 2.0;
        double b = 5.0;
        double expected = 10.0;
        assertEquals(expected, rechner.multi(a, b));
    }

    @Test
    void div() {
        double a = 25.0;
        double b = 5.0;
        double expected = 5.0;
        assertEquals(expected, rechner.div(a, b));
    }
}