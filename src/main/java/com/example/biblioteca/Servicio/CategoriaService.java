package com.example.biblioteca.Servicio;

import com.example.biblioteca.Entidades.Categoria;
import com.example.biblioteca.Repositporio.ICategoriaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    ICategoriaDao categoriaDao;

    public Categoria crearCategoria (Categoria nuevaCategoria){
        return categoriaDao.save(nuevaCategoria);
    }
}
