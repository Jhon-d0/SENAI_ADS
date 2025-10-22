package com.example.exercicio02.repository;

import com.example.exercicio02.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface PessoaRepository extends JpaRepository <Pessoa, UUID> {

}
