package com.jhondev.Ex7.infrastruture.repository;

import com.jhondev.Ex7.infrastruture.entites.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByEmail (String email);
}
