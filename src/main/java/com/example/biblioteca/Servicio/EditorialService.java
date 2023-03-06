package com.example.biblioteca.Servicio;

import com.example.biblioteca.Entidades.Editorial;
import com.example.biblioteca.Repositporio.IEditorialDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialService {

    @Autowired
    IEditorialDao editorialDao;

    public Editorial crearEditorial(Editorial nuevaEditorial){return editorialDao.save(nuevaEditorial);}
}
