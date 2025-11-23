package com.jhondev.Integracaofront.controller;

import com.jhondev.Integracaofront.busness.UsuarioService;
import com.jhondev.Integracaofront.dto.UsuarioRequestDTO;
import com.jhondev.Integracaofront.dto.UsuarioResponseDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> listarUsuarios(){
        return ResponseEntity
                .ok()
                .body(usuarioService.listar());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody UsuarioRequestDTO clienteRequestDTO) {
        usuarioService.salvarUsuario(clienteRequestDTO);

        return ResponseEntity
                .ok()
                .body(Map.of(
                        "menssagem", "Funcionário cadastrado com sucesso",
                        "sucesso", "true"
                ));
    }

    @PutMapping("/{email}")
    public ResponseEntity<Map<String, Object>> atualizar(@PathVariable String email, @Valid @RequestBody UsuarioRequestDTO usuarioRequestDTO) {
        usuarioService.atualizar(email, usuarioRequestDTO);

        return ResponseEntity
                .ok()
                .body(Map.of(
                        "menssagem", "Funcionário atualizado com sucesso",
                        "sucesso", "true"
                ));
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<Map<String, Object>> deletar(@PathVariable String email) {
        usuarioService.excluirUsuario(email);

        return ResponseEntity
                .ok()
                .body(Map.of(
                        "menssagem", "Funcionário deletado com sucesso",
                        "sucesso", "true"
                ));
    }
}
