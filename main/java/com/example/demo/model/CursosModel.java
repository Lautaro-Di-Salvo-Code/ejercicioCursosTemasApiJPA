package com.example.demo.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter @Setter
@Entity
public class CursosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_curso;
    private String nombre_curso, modalidad_curso;
    private String fecha_fin;

    @OneToMany
    private List<TemasModel> lista_temas;

    public CursosModel() {
    }

    public CursosModel(Long id_curso, String nombre_curso, String modalidad_curso,
                       String fecha_fin, List<TemasModel> lista_temas) {
        this.id_curso = id_curso;
        this.nombre_curso = nombre_curso;
        this.modalidad_curso = modalidad_curso;
        this.fecha_fin = fecha_fin;
        this.lista_temas = lista_temas;
    }
}
