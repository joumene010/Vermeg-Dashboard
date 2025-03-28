package com.example.vermegProject.repository;


import com.example.vermegProject.model.entity.Ret;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface RetRepository extends JpaRepository<Ret, Long> {
    List<Ret> findByJurisdictionId(String prefix);


}