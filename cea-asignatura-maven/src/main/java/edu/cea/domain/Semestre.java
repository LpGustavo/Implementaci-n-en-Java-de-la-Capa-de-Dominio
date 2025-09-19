package edu.cea.domain;

public final class Semestre {
    private final int valor;

    public Semestre(int valor) {
        if (valor < 1 || valor > 10) throw new IllegalArgumentException("Semestre debe estar entre 1 y 10");
        this.valor = valor;
    }

    public int getValor() { return valor; }
}
