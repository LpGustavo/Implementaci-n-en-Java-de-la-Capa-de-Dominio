package edu.cea.domain;

public final class NumeroCreditos {
    private final int valor;

    public NumeroCreditos(int valor) {
        if (valor < 1 || valor > 6) throw new IllegalArgumentException("Número de créditos debe estar entre 1 y 6");
        this.valor = valor;
    }

    public int getValor() { return valor; }
}
