package com.example.biblioteca.Controlador;

import com.example.biblioteca.Entidades.AutorLibro;
import com.example.biblioteca.Servicio.AutorLibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/autorLibro")
public class AutorLibroController {

    @Autowired
    AutorLibroService autorLibroService;


    @PostMapping(value = "/crearLibro")
    public AutorLibro agregarAutorLibro (@RequestBody AutorLibro autorLibro){return autorLibroService.crearAautorLibro(autorLibro);}
}
