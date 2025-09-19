package edu.cea.domain;

public class SemestreValidoSpecification {
    public boolean isSatisfiedBy(Asignatura asignatura) {
        int semestre = asignatura.getSemestre().getValor();
        return semestre >= 1 && semestre <= 10;
    }
}
