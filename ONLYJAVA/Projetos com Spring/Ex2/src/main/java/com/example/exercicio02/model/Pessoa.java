package com.example.exercicio02.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tab_pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ID;

    @Column(name = "nome", nullable = false, length = 40)
    private  String nome;

    @Column(name = "Data de Nascimento")
    private  String dataDeNascimento;

    @Column(name = "Telefone", nullable = false)
    private  String telefone;

    @Column(name = "email", unique = true, nullable = false)
    private  String email;

    @Enumerated(EnumType.STRING)
    private  Sexo sexo;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;


    public Pessoa() {
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
