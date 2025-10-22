package com.example.Ex3.repository;

import com.example.Ex3.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByProtocoloAtendimento (String protocoloAtendimento);
}
