package com.example.demo.controller;

import com.example.demo.model.TemasModel;
import com.example.demo.service.ITemasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TemasController {

    @Autowired
    private ITemasService serv_temas;

    @PostMapping("temas/post")
    public String postTemas(@RequestBody TemasModel e){
        serv_temas.postTemas(e);
        return "Tema creado con exito";

    }
    @PutMapping("temas/put")
    public TemasModel putTemas(@RequestBody TemasModel tem){
        serv_temas.putTemas(tem);
        return serv_temas.findTemas(tem.getId_tema());
    }

    @DeleteMapping("temas/del/{id_delete}")
    public String deleteTemas(@PathVariable Long id_delete){
        serv_temas.deleteTemas(id_delete);
        return "Tema eliminado con exito";

    }

}
