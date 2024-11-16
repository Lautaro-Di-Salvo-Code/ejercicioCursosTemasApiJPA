package com.example.demo.service;

import com.example.demo.model.CursosModel;
//import com.example.demo.model.TemasModel;
import com.example.demo.model.TemasModel;
import com.example.demo.repository.ICursoRepo;
//import com.example.demo.repository.ITemasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class aCursoService implements  ICursoService{

    @Autowired
    private ICursoRepo cur_repo_serv;
    @Override
    public List<CursosModel> getCursos() {
        List<CursosModel> get_cur = cur_repo_serv.findAll();
        return get_cur;
    }

    @Override
    public Optional<CursosModel> getCursosById(Long id) {
        return cur_repo_serv.findById(id);
    }

    @Override
    public void postCursos(CursosModel c) {
        cur_repo_serv.save(c);
    }

    @Override
    public void deleteCursos(Long id) {
        cur_repo_serv.deleteById(id);
    }

    @Override
    public CursosModel findCursos(Long id) {
        CursosModel cur_find  = cur_repo_serv.findById(id).orElse(null);
        return cur_find;
    }
//Version corta
    @Override
    public void putCursos_short(CursosModel cur) {
        this.postCursos(cur);
    }



//Version larga
//    @Override
//    public void putCursos(Long id_orig_cur,
//                          String new_name_cur,
//                          String new_mod,
//                          String fecha_fin,
//                          List<TemasModel> lista_temas
//                                                        ) {
//        CursosModel put_cur = this.findCursos(id_orig_cur);
//                put_cur.setNombre_curso(new_name_cur);
//                put_cur.setModalidad_curso(new_mod);
//
//                put_cur.setFecha_fin(fecha_fin );
//                put_cur.setLista_temas(lista_temas);
//                this.postCursos(put_cur);
//    }


}
