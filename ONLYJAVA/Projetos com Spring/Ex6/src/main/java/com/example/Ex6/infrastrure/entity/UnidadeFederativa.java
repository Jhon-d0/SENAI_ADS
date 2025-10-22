package com.example.Ex6.infrastrure.entity;

import jakarta.persistence.Enumerated;

public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");

    public String text, sigla;

    UnidadeFederativa(String text, String sigla) {
        this.text = text;
        this.sigla = sigla;
    }
}
