package com.example.vermegProject.service;

import com.example.vermegProject.model.entity.Ret;

import java.util.List;
import java.util.Optional;

public interface RetService {
    Ret create(Ret ret);
    Optional<Ret> findById(Long id);
    List<Ret> findAll();
    Ret update(Ret ret);
    void deleteById(Long id);
    List<Ret> getRetByJurisdictionId(String id);
}