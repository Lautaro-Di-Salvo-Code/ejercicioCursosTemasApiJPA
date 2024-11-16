package com.example.demo.service;

import com.example.demo.model.CursosModel;
import com.example.demo.model.TemasModel;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import com.example.demo.model.TemasModel;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ICursoService {

    public List<CursosModel> getCursos();
    public Optional<CursosModel> getCursosById(Long id);
    public void postCursos(CursosModel c);

    public void deleteCursos(Long id);
    public CursosModel findCursos(Long id);

//    public void putCursos(Long id_orig_cur,
//                          String new_name_cur,
//                          String new_mod,
//                          String fecha_fin,
//                          List<TemasModel> lista_temas
//                          );
    public void putCursos_short(CursosModel cur);
}
