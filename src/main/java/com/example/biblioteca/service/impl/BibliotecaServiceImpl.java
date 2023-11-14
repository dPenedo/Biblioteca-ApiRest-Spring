package com.example.biblioteca.service.impl;

import com.example.biblioteca.entity.Libro;
import com.example.biblioteca.repository.LibroRepository;
import com.example.biblioteca.service.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecaServiceImpl implements BibliotecaService {
    @Autowired
    private LibroRepository libroRepository;
    @Override
    public List<Libro> mostrarLibros() {
        return (List<Libro>) libroRepository.findAll();
    }
}
