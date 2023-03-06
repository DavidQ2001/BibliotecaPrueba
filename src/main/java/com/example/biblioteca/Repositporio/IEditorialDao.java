package com.example.biblioteca.Repositporio;


import com.example.biblioteca.Entidades.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEditorialDao extends JpaRepository<Editorial, Integer> {

    List<Editorial> findByNombreStartingWith(String letra);
}
