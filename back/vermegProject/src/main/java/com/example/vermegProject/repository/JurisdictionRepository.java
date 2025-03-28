package com.example.vermegProject.repository;
import com.example.vermegProject.model.entity.Jurisdiction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JurisdictionRepository extends JpaRepository<Jurisdiction, String> {


    @Override
    Optional<Jurisdiction> findById(String s);
}