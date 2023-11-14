package com.example.biblioteca.controller;

import com.example.biblioteca.entity.Libro;
import com.example.biblioteca.service.impl.BibliotecaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libros")
public class BibliotecaController {
    @Autowired
    private BibliotecaServiceImpl bibliotecaServiceImpl;
ls
}
