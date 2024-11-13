package com.example.demo.repository;

import com.example.demo.model.CursosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepo  extends JpaRepository<CursosModel, Long> {
}
