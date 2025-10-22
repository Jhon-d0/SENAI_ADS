package com.example.exercicio02.controller;

import com.example.exercicio02.model.Pessoa;
import com.example.exercicio02.repository.PessoaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class PessoaController {

    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<Pessoa> getPessoa (){
        return pessoaRepository.findAll();
    }

    public ResponseEntity <Pessoa> salvar (@RequestBody Pessoa pessoa){
        pessoaRepository.save(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoa);
    }

}
