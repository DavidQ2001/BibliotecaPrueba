package com.example.biblioteca.Repositporio;

import com.example.biblioteca.Entidades.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorDao extends CrudRepository<Autor,Integer> {


}
