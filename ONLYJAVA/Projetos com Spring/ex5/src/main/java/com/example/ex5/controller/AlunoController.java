package com.example.ex5.controller;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ex5.model.Aluno;
import com.example.ex5.repository.AlunoRepository;
import com.example.ex5.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    
   @Autowired
    private AlunoService alunoService;


    @GetMapping
    public List<Aluno> listarAlunos(){
        return alunoService.listarAlunos();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody Aluno aluno){
        alunoService.salvar(aluno);

        return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(Map.of("message", "Aluno cadastrado com sucesso!"));
    }

    @PutMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(@PathVariable UUID id, @RequestBody Aluno aluno){
        alunoService.atualizarAluno(id, aluno);

        return ResponseEntity
        .status(HttpStatus.OK)
        .body(Map.of("message", "Aluno atualizado com sucesso!"));
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> excluir(@PathVariable UUID id){
        alunoService.excluir(id);

        return ResponseEntity
        .status(HttpStatus.OK)
        .body(Map.of("message", "Aluno excluído com sucesso!"));
    }

}
