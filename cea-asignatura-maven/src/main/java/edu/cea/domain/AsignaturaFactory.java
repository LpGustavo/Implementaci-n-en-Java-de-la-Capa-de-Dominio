package edu.cea.domain;

public class AsignaturaFactory {
    public Asignatura crear(String codigo, String nombre, int numeroCreditos, int semestre, Profesor profesor) {
        return new Asignatura(codigo, nombre, new NumeroCreditos(numeroCreditos), new Semestre(semestre), profesor);
    }
}
