package com.example.demo.repositories;

import com.example.demo.entities.Autor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AutorRepositoy extends JpaRepository<Autor, Integer> {
}
