package com.example.biblioteca.Repositporio;

import com.example.biblioteca.Entidades.AutorLibro;
import com.example.biblioteca.Entidades.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriaDao extends CrudRepository<Categoria,Integer> {
}
