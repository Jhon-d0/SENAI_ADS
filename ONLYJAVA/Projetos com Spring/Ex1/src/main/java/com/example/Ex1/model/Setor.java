package com.example.Ex1.model;

public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Jurídico");

    public String textoSetor;

    Setor(String textoSetor) {
        this.textoSetor = textoSetor;
    }
}
