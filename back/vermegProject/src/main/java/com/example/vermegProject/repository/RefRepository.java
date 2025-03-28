package com.example.vermegProject.repository;

import com.example.vermegProject.model.entity.Ref;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RefRepository extends JpaRepository<Ref, Long> {


    List<Ref> findByRetId(Long retId);


}
