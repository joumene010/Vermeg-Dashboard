package com.example.vermegProject.service;

import com.example.vermegProject.model.entity.Nref;

import java.util.List;
import java.util.Optional;

public interface NrefService {
    Nref create(Nref nref);
    Optional<Nref> findById(Long id);
    List<Nref> findAll();
    Nref update(Nref nref);
    void deleteById(Long id);
}