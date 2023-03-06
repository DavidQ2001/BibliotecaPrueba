package com.example.biblioteca.Controlador;

import com.example.biblioteca.Entidades.Autor;
import com.example.biblioteca.Entidades.Categoria;
import com.example.biblioteca.Entidades.Libro;
import com.example.biblioteca.Repositporio.ICategoriaDao;
import com.example.biblioteca.Servicio.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @Autowired
    ICategoriaDao categoriaDao;

    @PostMapping(value = "/crearCategoria")
    public Categoria agregarCategoria(@RequestBody Categoria categoria){return categoriaService.crearCategoria(categoria);}

    @GetMapping("/categorias/total")
    public Long obtenerTotal() {
        return categoriaDao.count();
    }

    @GetMapping("/categorias")
    public List<Categoria> obtenerCategorias() {
        return (List<Categoria>) categoriaDao.findAll();
    }

    @DeleteMapping("/categorias/{id}")
    public void borrarCategoria(@PathVariable Integer id) {
        categoriaDao.deleteById(id);
    }

    @GetMapping("/categoria/{id}")
    public Categoria obtenerLibroPorId(@PathVariable Integer id) {
        return categoriaDao.findById(id).orElse(null);
    }

    @GetMapping("/existeCategoria/{id}")
    public boolean existePorId(@PathVariable Integer id) {
        return categoriaDao.existsById(id);
    }

}
