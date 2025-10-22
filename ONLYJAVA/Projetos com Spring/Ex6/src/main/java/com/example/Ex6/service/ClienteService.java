package com.example.Ex6.service;

import com.example.Ex6.infrastrure.entity.Cliente;
import com.example.Ex6.infrastrure.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarCliente (){
        return clienteRepository.findAll();
    }

    public Cliente salvar(Cliente cliente){
        if(clienteRepository.findByEmail(cliente.getEmail()).isPresent()){
            throw new RuntimeException("Email ja Registrado");
        }
        return clienteRepository.save(cliente);
    }

    public Cliente atualizarCliente(Long id, Cliente cliente){
        if(!clienteRepository.findById(cliente.getId()).isPresent()){
            throw new RuntimeException("Cliente não encontrado");
        }
        cliente.setId(id);
        return clienteRepository.save(cliente);
    }

    public void excluir(Long id){
        if(!clienteRepository.findById(id).isPresent()){
            throw new RuntimeException("Cliente não encontrado");
        }
        clienteRepository.deleteById(id);
    }

}
