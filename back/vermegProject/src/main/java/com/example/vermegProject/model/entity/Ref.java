package com.example.vermegProject.model.entity;



import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
@Table(name = "ref")
@Inheritance(strategy = InheritanceType.JOINED)
public class Ref implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String item;
    private String tabName;
    private String altFldName;
    private Integer fieldPos;
    private String reference;
    private Type type;
    private Integer sortPos;
    private String boeItem;
    private Boolean calcField;
    private String cellDesc;
    private Boolean doNotExport;
    private String reportLine;
    private Boolean cumulative;
    private String scheduleCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ret_id")
    private Ret ret;

}

