package edu.cea.domain;

import java.util.List;

public class ServicioCalculoCargaAcademica {
    public int calcularCarga(List<Asignatura> asignaturas) {
        return asignaturas.stream()
                .mapToInt(a -> a.getNumeroCreditos().getValor())
                .sum();
    }

    public boolean excedeLimite(List<Asignatura> asignaturas, int limite) {
        return calcularCarga(asignaturas) > limite;
    }
}
