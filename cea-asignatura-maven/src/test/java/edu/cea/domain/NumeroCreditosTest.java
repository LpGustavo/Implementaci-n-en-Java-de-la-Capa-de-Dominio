package edu.cea.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumeroCreditosTest {

    @Test
    void testCreditosValidos() {
        NumeroCreditos nc = new NumeroCreditos(3);
        assertEquals(3, nc.getValor());
    }

    @Test
    void testCreditosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new NumeroCreditos(0));
    }
}
