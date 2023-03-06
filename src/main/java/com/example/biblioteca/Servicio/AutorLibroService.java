package com.example.biblioteca.Servicio;

import com.example.biblioteca.Entidades.AutorLibro;
import com.example.biblioteca.Repositporio.IAutorLibroDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorLibroService {

    @Autowired
    IAutorLibroDao autorLibroDao;

    public AutorLibro crearAautorLibro(AutorLibro nuevoAutorLibro){return autorLibroDao.save(nuevoAutorLibro);}
}
