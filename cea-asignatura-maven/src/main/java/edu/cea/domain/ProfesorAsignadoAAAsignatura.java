package edu.cea.domain;

import java.time.LocalDateTime;

public class ProfesorAsignadoAAAsignatura {
    private final String codigoAsignatura;
    private final String idProfesor;
    private final LocalDateTime fecha;

    public ProfesorAsignadoAAAsignatura(String codigoAsignatura, String idProfesor) {
        this.codigoAsignatura = codigoAsignatura;
        this.idProfesor = idProfesor;
        this.fecha = LocalDateTime.now();
    }

    public String getCodigoAsignatura() { return codigoAsignatura; }
    public String getIdProfesor() { return idProfesor; }
    public LocalDateTime getFecha() { return fecha; }
}
