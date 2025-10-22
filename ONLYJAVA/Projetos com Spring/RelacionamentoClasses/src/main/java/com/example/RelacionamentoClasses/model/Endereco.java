package com.example.RelacionamentoClasses.model;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tab_endereco")
public class Endereco {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @Column(nullable = false)
    private String logradouro;

    @Column(nullable = false)
    private String numero;


    public Endereco() {
    }

    public Endereco(UUID uuid, String logradouro, String numero) {
        this.uuid = uuid;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
