package fr.ekod.calcul;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarreTest {

    @Test
    void testCarreEntier() {
        int nombre = 5;
        assertEquals(25, Calculatrice.carre(nombre));
    }

    @Test
    void testZero() {
        int nombre = 0;
        assertEquals(0, Calculatrice.carre(nombre));
    }
}