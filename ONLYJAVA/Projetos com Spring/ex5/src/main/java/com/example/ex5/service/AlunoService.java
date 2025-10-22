package com.example.ex5.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ex5.model.Aluno;
import com.example.ex5.repository.AlunoRepository;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    public Aluno salvar (Aluno aluno) {
        if(alunoRepository.findByEmail(aluno.getEmail()).isPresent()){
            throw new RuntimeException("Email já cadastrado");
        }
        return alunoRepository.save(aluno);
    }


    public Aluno atualizarAluno(UUID id, Aluno aluno){
        if(!alunoRepository.findById(aluno.getId()).isPresent()){
            throw new RuntimeException("Aluno não encontrado");
        }
        aluno.setId(id);
        return alunoRepository.save(aluno);
    }

    public void excluir(UUID id){
        if(!alunoRepository.findById(id).isPresent()){
            throw new RuntimeException("Aluno não encontrado");
        }
        alunoRepository.deleteById(id);
    }


}
