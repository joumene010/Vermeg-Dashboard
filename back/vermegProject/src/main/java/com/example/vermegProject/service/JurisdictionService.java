package com.example.vermegProject.service;

import com.example.vermegProject.model.entity.Jurisdiction;

import java.util.List;
import java.util.Optional;

public interface JurisdictionService {
    Jurisdiction create(Jurisdiction jurisdiction);
    Optional<Jurisdiction> findById(String prefix);
    List<Jurisdiction> findAll();
    Jurisdiction update(Jurisdiction jurisdiction);
    void deleteById(String prefix);
}