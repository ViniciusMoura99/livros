package com.biblioteca.livros.rest.controller;


import com.biblioteca.livros.rest.LivrosRest;
import com.sun.source.tree.ReturnTree;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import javax.websocket.OnError;

@RestController
public class IdentacaoController implements LivrosRest {

    @Override
    public ResponseEntity<Object> getIdentacao(String n, String s){
        String temp;
        String resp;
        // variavel temporaia para armazenar o sobrenome hehe

        temp = s;
        s = n;
        n = temp;

        resp = "O Nome do Autor é: " + n + ", " + s;

           // if(type != String){
            //return ResponseEntity.ok("digite apenas caracteres");


        return ResponseEntity.ok(resp);

        }
    }



