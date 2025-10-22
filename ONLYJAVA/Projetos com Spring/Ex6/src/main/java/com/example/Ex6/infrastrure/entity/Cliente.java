package com.example.Ex6.infrastrure.entity;


import jakarta.persistence.*;
import lombok.*;




@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tab_funcionario")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;



}
