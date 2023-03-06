package com.example.biblioteca.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "AutoresLibros")
public class AutorLibro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",nullable = false)
    private  Integer id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id")
    private Autor autor;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "libro_id")
    private Libro libro;

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
