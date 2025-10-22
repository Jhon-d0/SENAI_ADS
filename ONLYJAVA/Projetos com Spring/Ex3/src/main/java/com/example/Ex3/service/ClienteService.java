package com.example.Ex3.service;


import com.example.Ex3.model.Cliente;
import com.example.Ex3.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> clienteList(){
        return clienteRepository.findAll();
    }

    public Cliente salvarCliente(Cliente cliente){
        if (clienteRepository.findByProtocoloAtendimento(cliente.getProtocoloAtendimento()).isPresent()){
            throw new RuntimeException("Cliente já cadastrado");
        }
        return clienteRepository.save(cliente);
    }



    public ClienteRepository getClienteRepository() {
        return clienteRepository;
    }

    public void setClienteRepository(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
}
