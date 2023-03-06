package com.example.biblioteca.Repositporio;

import com.example.biblioteca.Entidades.AutorLibro;
import com.example.biblioteca.Entidades.InfoAdicional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInfoAdicionalDao extends CrudRepository<InfoAdicional,Integer>  {
}
