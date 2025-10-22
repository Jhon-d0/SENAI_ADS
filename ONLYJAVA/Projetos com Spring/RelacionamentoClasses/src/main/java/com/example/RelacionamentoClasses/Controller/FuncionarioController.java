package com.example.RelacionamentoClasses.Controller;


import com.example.RelacionamentoClasses.Repository.FuncionarioRepository;
import com.example.RelacionamentoClasses.model.Funcionario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @GetMapping
    public List<Funcionario> getfuncionario(){
        return funcionarioRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Funcionario> Salvar(@RequestBody Funcionario funcionario){
        funcionarioRepository.save(funcionario);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(funcionario);
    }

    public FuncionarioRepository getFuncionarioRepository() {
        return funcionarioRepository;
    }

    public void setFuncionarioRepository(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }
}
