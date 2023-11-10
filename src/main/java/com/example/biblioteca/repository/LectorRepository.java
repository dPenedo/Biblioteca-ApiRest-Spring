package com.example.biblioteca.repository;

import com.example.biblioteca.entity.Lector;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectorRepository extends JpaRepository<Lector, Long> {
}
