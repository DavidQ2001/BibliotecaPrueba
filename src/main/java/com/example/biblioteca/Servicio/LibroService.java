package com.example.biblioteca.Servicio;

import com.example.biblioteca.Entidades.AutorLibro;
import com.example.biblioteca.Entidades.Libro;
import com.example.biblioteca.Repositporio.IAutorLibroDao;
import com.example.biblioteca.Repositporio.IlibroDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {

    @Autowired
    IlibroDao libroDao;



    public Libro crearLibro(Libro nuevoLibro){return libroDao.save(nuevoLibro);}



}
