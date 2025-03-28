package com.example.vermegProject.repository;
import com.example.vermegProject.model.entity.Cref;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrefRepository extends JpaRepository<Cref, Long> {


}