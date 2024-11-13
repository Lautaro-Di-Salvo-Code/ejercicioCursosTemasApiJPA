package com.example.demo.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class TemasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_tema;
    private String nombre, descripcion;
//    @ManyToOne
//    private CursosModel cursos_model;
    public TemasModel() {
    }

    public TemasModel(Long id_tema,
                      String nombre,
                      String descripcion
    ) {
        this.id_tema = id_tema;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
