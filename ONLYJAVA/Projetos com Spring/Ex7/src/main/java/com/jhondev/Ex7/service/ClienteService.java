package com.jhondev.Ex7.service;


import com.jhondev.Ex7.infrastruture.entites.Cliente;
import com.jhondev.Ex7.infrastruture.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private ClienteRepository clienteRepository;

    public List<Cliente> listarCliente (){
        return clienteRepository.findAll();
    }

    public Cliente buscarClientePorEmail (String email){
        return clienteRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("email não encontrado"));
    }

    public Cliente salvarCliente (Cliente cliente){
        if (clienteRepository.findByEmail(cliente.getEmail()).isPresent()){
            throw new RuntimeException("Usuario ja cadastrado com o email");
        }

        return clienteRepository.save(cliente);
    }

    public Cliente ataualizarCliente (String email, Cliente cliente){
        Cliente clienteEntity = buscarClientePorEmail(email);
        Cliente clienteAtualizado = Cliente.builder()
                .nome(cliente.getNome() == null ? clienteEntity.getNome() : cliente.getNome())
                .email(cliente.getEmail() == null ? clienteEntity.getEmail() : cliente.getEmail())
                .endereco(cliente.getEndereco() == null ? clienteEntity.getEndereco() : cliente.getEndereco())
                .formaPagamento(cliente.getFormaPagamento() == null ? clienteEntity.getFormaPagamento() : cliente.getFormaPagamento())
                .telefone(cliente.getTelefone() == null ? clienteEntity.getTelefone() : cliente.getTelefone())
                .build();

        return clienteRepository.save(clienteAtualizado);
    }

}
