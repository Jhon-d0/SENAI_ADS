package com.example.Ex6.controller;

import com.example.Ex6.infrastrure.entity.Cliente;
import com.example.Ex6.infrastrure.repository.ClienteRepository;
import com.example.Ex6.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listarCliente (){
        return clienteService.listarCliente();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody Cliente cliente){
        clienteService.salvar(cliente);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("message", "Cliente cadastrado com sucesso!"));
    }

    @PutMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        clienteService.atualizarCliente(id, cliente);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("message", "Cliente atualizado com sucesso!"));
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> excluir(@PathVariable Long id){
        clienteService.excluir(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("message", "Cliente excluído com sucesso!"));
    }


}
