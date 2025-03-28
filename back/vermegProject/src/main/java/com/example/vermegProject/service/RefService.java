package com.example.vermegProject.service;

import com.example.vermegProject.model.entity.Ref;

import java.util.List;
import java.util.Optional;

public interface RefService {
    Ref create(Ref ref);
    Optional<Ref> findById(Long id);
    List<Ref> findAll();
    Ref update(Ref ref);
    void deleteById(Long id);
    List<Ref> findRefsByRetId(Long retId);
}