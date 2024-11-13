package com.example.demo.repository;

import com.example.demo.model.CursosModel;
import com.example.demo.model.TemasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemasRepo  extends JpaRepository<TemasModel, Long> {
}
