package com.example.biblioteca.Controlador;

import com.example.biblioteca.Entidades.Libro;
import com.example.biblioteca.Repositporio.IlibroDao;
import com.example.biblioteca.Servicio.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/libro")
public class LibroController {

    @Autowired
    LibroService libroService;

    @Autowired
    IlibroDao libroDao;

    @PostMapping(value = "/crearLibro")
    public Libro agregarLibro(@RequestBody Libro libro){return libroService.crearLibro(libro);
    }

    @GetMapping(value = "/encontrarLibro/{titulo}")
    public Libro encontarProductoNombre(@PathVariable String titulo){
        return libroDao.findByTitulo(titulo).orElse(null);
    }

    @GetMapping("/libros/total")
    public Long obtenerTotal() {
        return libroDao.count();
    }

    @GetMapping("/libros")
    public List<Libro> obtenerLibros() {
        return (List<Libro>) libroDao.findAll();
    }

    @DeleteMapping("/libros/{id}")
    public void borrarLibro(@PathVariable Integer id) {
        libroDao.deleteById(id);
    }

    @GetMapping("/libro/{id}")
    public Libro obtenerLibroPorId(@PathVariable Integer id) {
        return libroDao.findById(id).orElse(null);
    }


    @GetMapping("/existeLibro/{id}")
    public boolean existePorId(@PathVariable Long id) {
        return libroDao.existsById(id);
    }


}
