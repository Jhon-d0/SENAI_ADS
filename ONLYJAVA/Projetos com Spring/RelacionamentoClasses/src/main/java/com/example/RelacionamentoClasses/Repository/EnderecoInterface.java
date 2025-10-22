package com.example.RelacionamentoClasses.Repository;

import com.example.RelacionamentoClasses.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EnderecoInterface extends JpaRepository<Endereco, UUID> {

}
