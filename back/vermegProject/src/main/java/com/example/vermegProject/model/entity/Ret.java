package com.example.vermegProject.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "ret")
public class Ret implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "jurisdiction_id", referencedColumnName = "prefix")
    private Jurisdiction jurisdiction;
    private String returnName;
    private int version;
    private int regId;
    private int formOrder;
    private LocalDateTime compBatchRun;
    private String compOutputTable;
    private LocalDateTime transmitBatchRun;
    private String outputRecord;
    private LocalDateTime period;
    private LocalDateTime activateDate;
    private LocalDateTime deactivateDate;
    private int intervalType;
    private int intervalFrequency;
    private boolean exclHolidays;
    private boolean exclWeekends;
    private boolean required;
    private String adjTab;
    private String valTab;
    private String xValTab;
    private String name;
    private String stbDataGroup;
    private boolean newFormBatchRun;
    private String newFormOutputTable;
    private boolean keepNullNumeric;
    private String decisionDll;
    private String regTransModelId;
    private String onlyDataProcess;
    private String regRepInterval;
    private String templateName;
    private String templateAlias;
    private String workSheetPage;
    private float numericScaleDecimals;

    private Rounding rounding;

    @OneToMany(mappedBy = "ret")
    private List<Ref> refs;
}