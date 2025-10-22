package com.jhondev.validation.security.service;

import com.jhondev.validation.security.dto.UsuarioRequestDTO;
import com.jhondev.validation.security.dto.UsuarioResponseDTO;
import com.jhondev.validation.security.infrastruture.entites.UsuarioModel;
import com.jhondev.validation.security.infrastruture.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServices {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UsuarioModel salvarUsuario(UsuarioRequestDTO usuarioRequestDTO) {
//       usuarioRepository.findByEmail(usuarioRequestDTO.getEmail())
//               .ifPresent(u -> {
//                   throw new RuntimeException("Email já cadastrado");});
        if (usuarioRepository.findByEmail(usuarioRequestDTO.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email já cadastrado");
        }

        UsuarioModel usuario = new UsuarioModel();
        usuario.setNome(usuarioRequestDTO.getNome());
        usuario.setEmail(usuarioRequestDTO.getEmail());

        usuario.setSenha(bCryptPasswordEncoder.encode(usuarioRequestDTO.getSenha()));

        usuarioRepository.save(usuario);
        return usuario;
    }

    public List<UsuarioResponseDTO> listar(){
        return usuarioRepository.findAll()
                .stream()
                .map(u -> new UsuarioResponseDTO(u.getNome(), u.getEmail()))
                .toList();
    }
}