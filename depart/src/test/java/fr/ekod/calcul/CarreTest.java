package fr.ekod.calcul;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarreTest {

    @Test
    void testCarreEntier() {
        assertEquals(25, Calculatrice.carre(5));
    }
}
