package com.example.biblioteca.Repositporio;

import com.example.biblioteca.Entidades.AutorLibro;
import com.example.biblioteca.Entidades.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IlibroDao extends CrudRepository<Libro,Integer>{

    public Optional<Libro> findByTitulo(String titulo);

    boolean existsById(Long id);
}
