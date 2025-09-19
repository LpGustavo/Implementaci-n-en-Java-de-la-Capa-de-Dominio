package edu.cea.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ServicioCalculoCargaAcademicaTest {

    @Test
    void testCalcularCarga() {
        Profesor profesor = new Profesor("P1", "Juan Pérez", new Email("juan@uni.edu"));
        Asignatura a1 = new Asignatura("A1", "DDD", new NumeroCreditos(3), new Semestre(3), profesor);
        Asignatura a2 = new Asignatura("A2", "Hexagonal", new NumeroCreditos(4), new Semestre(4), profesor);

        ServicioCalculoCargaAcademica servicio = new ServicioCalculoCargaAcademica();
        int carga = servicio.calcularCarga(List.of(a1, a2));

        assertEquals(7, carga);
    }

    @Test
    void testExcedeLimite() {
        Profesor profesor = new Profesor("P1", "Juan Pérez", new Email("juan@uni.edu"));
        Asignatura a1 = new Asignatura("A1", "DDD", new NumeroCreditos(5), new Semestre(3), profesor);
        Asignatura a2 = new Asignatura("A2", "Hexagonal", new NumeroCreditos(4), new Semestre(4), profesor);

        ServicioCalculoCargaAcademica servicio = new ServicioCalculoCargaAcademica();
        assertTrue(servicio.excedeLimite(List.of(a1, a2), 8));
    }
}
