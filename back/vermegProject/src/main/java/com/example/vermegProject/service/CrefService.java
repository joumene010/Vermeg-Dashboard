package com.example.vermegProject.service;

import com.example.vermegProject.model.entity.Cref;

import java.util.List;
import java.util.Optional;

public interface CrefService {
    Cref create(Cref cref);
    Optional<Cref> findById(Long id);
    List<Cref> findAll();
    Cref update(Cref cref);
    void deleteById(Long id);
}