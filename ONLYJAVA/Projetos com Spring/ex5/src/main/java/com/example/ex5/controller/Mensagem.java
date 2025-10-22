package com.example.ex5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class Mensagem {

    @GetMapping
    public String texto(){
        return "Olá, mundo!";
    }

}
