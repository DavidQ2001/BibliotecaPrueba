package com.example.biblioteca.Servicio;

import com.example.biblioteca.Entidades.Autor;
import com.example.biblioteca.Repositporio.IAutorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {

    @Autowired
    IAutorDao autorDao;



    public Autor crearAutor (Autor nuevoAutor){
        return autorDao.save(nuevoAutor);
    }




}

