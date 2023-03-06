package com.example.biblioteca.Entidades;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "infoAdicionales")
public class InfoAdicional {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",nullable = false)
    private  Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "libro_id")
    private Libro libro;

    private String idioma;

    @Column(name = "fecha_publicacion")
    private Date fechaPublicacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @PrePersist
    public void prePersit(){
        this.fechaPublicacion = new Date();
    }
}
