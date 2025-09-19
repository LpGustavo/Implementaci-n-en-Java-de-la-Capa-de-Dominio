package edu.cea.domain;

import java.util.regex.Pattern;

public final class Email {
    private final String direccion;

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[^@]+@[^@]+\.[^@]+$");

    public Email(String direccion) {
        if (direccion == null || !EMAIL_PATTERN.matcher(direccion).matches()) {
            throw new IllegalArgumentException("Email inválido");
        }
        this.direccion = direccion;
    }

    public String getDireccion() { return direccion; }
}
