package com.example.demo.service;

import com.example.demo.model.TemasModel;
import com.example.demo.repository.ITemasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class aTemasService implements ITemasService{

    @Autowired
    private ITemasRepo tema_repo_serv;

    @Override
    public void postTemas(TemasModel t) {
        tema_repo_serv.save(t);
    }

    @Override
    public void deleteTemas(Long id) {
        tema_repo_serv.deleteById(id);
    }

    @Override
    public TemasModel findTemas(Long id) {
        TemasModel tem_find = tema_repo_serv.findById(id).orElse(null);
        return tem_find;
    }

    @Override
    public void putTemas(TemasModel tem) {
        this.postTemas(tem);
    }
}
