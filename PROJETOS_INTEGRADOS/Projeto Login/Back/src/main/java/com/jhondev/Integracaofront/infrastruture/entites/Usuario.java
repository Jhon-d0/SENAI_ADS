package com.jhondev.Integracaofront.infrastruture.entites;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tab_usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String senha;
}
