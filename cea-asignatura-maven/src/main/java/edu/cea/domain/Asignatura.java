package edu.cea.domain;

import java.util.Objects;

public class Asignatura {
    private final String codigo;
    private String nombre;
    private NumeroCreditos numeroCreditos;
    private Semestre semestre;
    private Profesor profesor;

    public Asignatura(String codigo, String nombre, NumeroCreditos numeroCreditos, Semestre semestre, Profesor profesor) {
        if (codigo == null || codigo.isBlank()) throw new IllegalArgumentException("El código no puede ser vacío");
        this.codigo = codigo;
        this.setNombre(nombre);
        this.setNumeroCreditos(numeroCreditos);
        this.setSemestre(semestre);
        this.setProfesor(profesor);
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public NumeroCreditos getNumeroCreditos() { return numeroCreditos; }
    public Semestre getSemestre() { return semestre; }
    public Profesor getProfesor() { return profesor; }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("El nombre no puede ser vacío");
        this.nombre = nombre;
    }

    public void setNumeroCreditos(NumeroCreditos numeroCreditos) {
        if (numeroCreditos == null) throw new IllegalArgumentException("Créditos inválidos");
        this.numeroCreditos = numeroCreditos;
    }

    public void setSemestre(Semestre semestre) {
        if (semestre == null) throw new IllegalArgumentException("Semestre inválido");
        this.semestre = semestre;
    }

    public void setProfesor(Profesor profesor) {
        if (profesor == null) throw new IllegalArgumentException("Debe existir un profesor asignado");
        this.profesor = profesor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Asignatura)) return false;
        Asignatura that = (Asignatura) o;
        return codigo.equals(that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
