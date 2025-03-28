package com.example.vermegProject.repository;
import com.example.vermegProject.model.entity.Nref;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NrefRepository extends JpaRepository<Nref, Long> {

}