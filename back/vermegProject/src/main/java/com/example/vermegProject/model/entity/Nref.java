package com.example.vermegProject.model.entity;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Nref extends Ref implements Serializable {
    private int numericScale;
    private int decimalValue;
    private String rounding;
}
