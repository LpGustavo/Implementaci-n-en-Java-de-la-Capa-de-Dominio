package edu.cea.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AsignaturaTest {

    @Test
    void testCrearAsignaturaConProfesor() {
        Profesor profesor = new Profesor("P1", "Juan Pérez", new Email("juan@uni.edu"));
        Asignatura asignatura = new Asignatura("A1", "DDD", new NumeroCreditos(4), new Semestre(5), profesor);
        assertEquals("A1", asignatura.getCodigo());
        assertEquals("Juan Pérez", asignatura.getProfesor().getNombreCompleto());
    }

    @Test
    void testAsignaturaSinProfesor() {
        assertThrows(IllegalArgumentException.class,
                () -> new Asignatura("A1", "DDD", new NumeroCreditos(4), new Semestre(5), null));
    }
}
