package com.jhondev.Ex7.infrastruture.entites;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tab_cliente")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Cliente {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String formaPagamento;

    @Column(nullable = false)
    private String endereco;

}
