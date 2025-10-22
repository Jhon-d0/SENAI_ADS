package com.jhondev.validation.security.infrastruture.repository;

import com.jhondev.validation.security.infrastruture.entites.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository <UsuarioModel, Long> {
    Optional<UsuarioModel> findByEmail(String email);
}