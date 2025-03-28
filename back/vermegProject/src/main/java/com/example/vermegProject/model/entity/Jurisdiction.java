package com.example.vermegProject.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "jurisdiction")
public class Jurisdiction implements Serializable {
    @Id
    private  String prefix;
    private String description;

    @OneToMany(mappedBy = "jurisdiction")
    private List<Ret> rets;



}