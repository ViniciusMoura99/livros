package com.biblioteca.livros.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/livros")
public interface LivrosRest {

    @GetMapping("/identacao/{nome}/{sobrenome}")
    ResponseEntity<Object> getIdentacao(@PathVariable(value = "nome") String n, @PathVariable(value = "sobrenome") String s);

}
