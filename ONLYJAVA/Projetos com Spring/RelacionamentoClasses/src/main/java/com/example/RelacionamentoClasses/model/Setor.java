package com.example.RelacionamentoClasses.model;



public enum Setor {
    RECURSOS_HUMANOS("Recursos Humanos"),
    FINANCEIRO("Financeiro"),
    OPERACOES("Operações");

    public String text;

    Setor(String text) {
        this.text = text;
    }
}
