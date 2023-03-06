package com.example.biblioteca.Controlador;
import com.example.biblioteca.Entidades.Editorial;
import com.example.biblioteca.Repositporio.IEditorialDao;
import com.example.biblioteca.Servicio.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/editorial")
public class EditorialController {

    @Autowired
    EditorialService editorialService;

    @Autowired
    IEditorialDao editorialDao;

    @PostMapping(value = "/crearEditorial")
    public Editorial  agrgarEditorial (@RequestBody Editorial editorial){return editorialService.crearEditorial(editorial);}

    @GetMapping("/editoriales/{letra}")
    public List<Editorial> buscarPorLetra(@PathVariable String letra) {
        return editorialDao.findByNombreStartingWith(letra);
    }


    @GetMapping("/editoriales/total")
    public Long obtenerTotal() {
        return editorialDao.count();
    }

    @GetMapping("/editoriales")
    public List<Editorial> obtenerEditoriales() {
        return (List<Editorial>) editorialDao.findAll();
    }

    @DeleteMapping("/editoriales/{id}")
    public void borrarLibro(@PathVariable Integer id) {
        editorialDao.deleteById(id);
    }

    @GetMapping("/editorial/{id}")
    public Editorial obtenerLibroPorId(@PathVariable Integer id) {
        return editorialDao.findById(id).orElse(null);
    }

    @GetMapping("/existeEditorial/{id}")
    public boolean existePorId(@PathVariable Integer id) {
        return editorialDao.existsById(id);
    }

}
