package com.example.biblioteca.Controlador;
import com.example.biblioteca.Entidades.Autor;
import com.example.biblioteca.Entidades.Libro;
import com.example.biblioteca.Repositporio.IAutorDao;
import com.example.biblioteca.Servicio.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/autor")
public class AutorController {

    @Autowired
    AutorService autorService;

    @Autowired
    IAutorDao autorDao;

    @PostMapping(value = "/crear")
    public Autor agregarAutor(@RequestBody Autor autor){return autorService.crearAutor(autor);
    }


    @GetMapping("/autores/total")
    public Long obtenerTotal() {
        return autorDao.count();
    }

    @GetMapping("/autores")
    public List<Autor> obtenerAutores() {
        return (List<Autor>) autorDao.findAll();
    }

    @DeleteMapping("/autores/{id}")
    public void borrarAutor(@PathVariable Integer id) {
        autorDao.deleteById(id);
    }

    @GetMapping("/autor/{id}")
    public Autor obtenerLibroPorId(@PathVariable Integer id) {
        return autorDao.findById(id).orElse(null);
    }

    @GetMapping("/existeAutor/{id}")
    public boolean existePorId(@PathVariable Integer id) {
        return autorDao.existsById(id);
    }




}



