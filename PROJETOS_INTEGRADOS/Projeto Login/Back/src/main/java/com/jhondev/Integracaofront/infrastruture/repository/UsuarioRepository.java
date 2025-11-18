package com.jhondev.Integracaofront.infrastruture.repository;

import com.jhondev.Integracaofront.infrastruture.entites.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByemail (String email);

}
