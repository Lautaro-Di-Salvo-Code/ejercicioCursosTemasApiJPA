package com.example.demo.controller;

import com.example.demo.model.CursosModel;
import com.example.demo.model.TemasModel;
import com.example.demo.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class CursosController {

    @Autowired
    private ICursoService cur_serv;

    @GetMapping("cursos/get")
    public List<CursosModel> getCursos(){
        return cur_serv.getCursos();
    }
    @DeleteMapping("cursos/del/{id}")
    public String deleteCursos(@PathVariable Long id){
            cur_serv.deleteCursos(id);
            return "Curso Eliminado";
    }
    @PostMapping("cursos/post")
    public String postCursos(@RequestBody CursosModel c){
        cur_serv.postCursos(c);
        return "Curso creado con exito";
    }

//    @PutMapping("cursos/put/{id_orig_cur}")
//    public CursosModel putCursos(@PathVariable Long id_orig_cur,
//                            @RequestParam(required = false, name = "nombreCurso")String new_name_cur,
//                            @RequestParam(required = false, name = "nombreModalidad")String new_mod,
//                            @RequestParam(required = false, name = "fecha_final") String fecha_fin,
//                            @RequestParam(required = false, name = "lista_temas") List<TemasModel> lista_temas
//                            ){
//        cur_serv.putCursos(id_orig_cur, new_name_cur ,new_mod ,fecha_fin, lista_temas);
//
//        CursosModel cur_put = cur_serv.findCursos(id_orig_cur);
//        return cur_put;
//    }
//    Si no se entiende el procedo este corto, se repasa
    @PutMapping("cursos/put")
    public CursosModel putCursos(@RequestBody CursosModel a){
        cur_serv.putCursos_short(a);
        return cur_serv.findCursos(a.getId_curso());
    }

}
