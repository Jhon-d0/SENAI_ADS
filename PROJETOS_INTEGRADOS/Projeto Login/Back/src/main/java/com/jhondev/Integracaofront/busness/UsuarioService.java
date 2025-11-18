package com.jhondev.Integracaofront.busness;

import com.jhondev.Integracaofront.infrastruture.entites.Usuario;
import com.jhondev.Integracaofront.infrastruture.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.SplittableRandom;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listarusuario(){
        return usuarioRepository.findAll();
    }

    public Usuario buscarUsuarioPorEmail (String email){
        return usuarioRepository.findByemail(email)
                .orElseThrow(() -> new RuntimeException("email não encontrado"));
    }

    public Usuario salvarUsuario (Usuario usuario){
        if (usuarioRepository.findByemail(usuario.getEmail()).isPresent()){
            throw new RuntimeException("Usuario ja cadastrado");
        }
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizarUsuario (Usuario usuario, String email){
        Usuario usuarioEntity = buscarUsuarioPorEmail(email);
        Usuario usuarioAtualziado = Usuario.builder()
                .nome(usuario.getNome() == null ? usuarioEntity.getNome() : usuario.getNome())
                .email(usuario.getEmail() == null ? usuarioEntity.getEmail() : usuario.getEmail())
                .senha(usuario.getSenha() == null ? usuarioEntity.getSenha() : usuario.getSenha())
                .build();

        return usuarioRepository.save(usuarioAtualziado);
    }

    public void excluirUsuario (String email){
        Usuario usuarioEncontradoPorEmail = buscarUsuarioPorEmail(email);
        usuarioRepository.deleteById(usuarioEncontradoPorEmail.getId());
    }
}
