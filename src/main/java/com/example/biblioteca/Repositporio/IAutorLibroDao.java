package com.example.biblioteca.Repositporio;

import com.example.biblioteca.Entidades.AutorLibro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorLibroDao extends CrudRepository<AutorLibro,Integer> {
}
