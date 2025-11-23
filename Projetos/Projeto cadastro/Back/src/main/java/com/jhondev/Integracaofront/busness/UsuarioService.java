package com.jhondev.Integracaofront.busness;

import com.jhondev.Integracaofront.dto.UsuarioRequestDTO;
import com.jhondev.Integracaofront.dto.UsuarioResponseDTO;
import com.jhondev.Integracaofront.infrastruture.entites.Usuario;
import com.jhondev.Integracaofront.infrastruture.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.SplittableRandom;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioResponseDTO> listar(){
        return usuarioRepository.findAll()
                .stream()
                .map(u -> new UsuarioResponseDTO(u.getNome(), u.getEmail()))
                .toList();
    }

    public Usuario buscarUsuarioPorEmail (String email){
        return usuarioRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("email não encontrado"));
    }

    public Usuario salvarUsuario (@Valid UsuarioRequestDTO dto){
        if (usuarioRepository.findByEmail(dto.getEmail()).isPresent()){
            throw new IllegalArgumentException("Email ja cadastrado");
        }

        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());

        usuarioRepository.save(usuario);
        return usuario;
    }

    public Usuario atualizar(String email, @Valid UsuarioRequestDTO dto) {

        Usuario usuario = buscarUsuarioPorEmail(email);

        if (dto.getNome() != null) {
            usuario.setNome(dto.getNome());
        }

        if (dto.getEmail() != null) {
            usuario.setEmail(dto.getEmail());
        }

        if (dto.getSenha() != null) {
            usuario.setSenha(dto.getSenha());
        }

        return usuarioRepository.save(usuario);
    }


    public void excluirUsuario (String email){
        Usuario usuarioEncontradoPorEmail = buscarUsuarioPorEmail(email);
        usuarioRepository.deleteById(usuarioEncontradoPorEmail.getId());
    }
}
