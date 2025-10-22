package com.jhondev.validation.security.controller;

import com.jhondev.validation.security.dto.UsuarioRequestDTO;
import com.jhondev.validation.security.dto.UsuarioResponseDTO;
import com.jhondev.validation.security.infrastruture.entites.UsuarioModel;
import com.jhondev.validation.security.service.UsuarioServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioServices usuarioServices;

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> listar() {
        return ResponseEntity
                .ok()
                .body(usuarioServices.listar());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody UsuarioRequestDTO usuarioRequestDTO) {
        UsuarioModel usuario = usuarioServices.salvarUsuario(usuarioRequestDTO);


        // Gera um endpoint para carregar de dados do novo usuário
        // localhost:8080/usuarios/1

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(usuario.getId())
                .toUri();

        return ResponseEntity
                .created(location)
                .body(Map.of("menssagem", "Usuário cadastrado com sucesso"));
    }
}