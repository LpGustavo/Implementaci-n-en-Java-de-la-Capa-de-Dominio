package edu.cea.domain;

import java.util.Objects;

public class Profesor {
    private final String idProfesor;
    private String nombreCompleto;
    private Email email;

    public Profesor(String idProfesor, String nombreCompleto, Email email) {
        if (idProfesor == null || idProfesor.isBlank()) throw new IllegalArgumentException("ID inválido");
        this.idProfesor = idProfesor;
        this.setNombreCompleto(nombreCompleto);
        this.setEmail(email);
    }

    public String getIdProfesor() { return idProfesor; }
    public String getNombreCompleto() { return nombreCompleto; }
    public Email getEmail() { return email; }

    public void setNombreCompleto(String nombreCompleto) {
        if (nombreCompleto == null || nombreCompleto.isBlank()) throw new IllegalArgumentException("Nombre inválido");
        this.nombreCompleto = nombreCompleto;
    }

    public void setEmail(Email email) {
        if (email == null) throw new IllegalArgumentException("Email inválido");
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Profesor)) return false;
        Profesor profesor = (Profesor) o;
        return idProfesor.equals(profesor.idProfesor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProfesor);
    }
}
