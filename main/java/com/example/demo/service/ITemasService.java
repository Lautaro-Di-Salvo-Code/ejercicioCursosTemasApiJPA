package com.example.demo.service;

import com.example.demo.model.TemasModel;

import java.util.List;

public interface ITemasService {

//    public List<TemasModel> getTemas();
    public void postTemas(TemasModel t);
    public void deleteTemas(Long id);


    public TemasModel findTemas(Long id);

    public void putTemas(TemasModel tem);
}
