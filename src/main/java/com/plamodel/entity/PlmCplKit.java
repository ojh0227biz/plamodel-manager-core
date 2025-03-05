package com.plamodel.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PLM_SLD_KIT")
public class PlmCplKit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kitId;
    private String kitGrd;
    private String kitName;
    private Integer kitPrscPrc;
    private Integer kitLstPrc;
    private Integer kitPrcDiff;
    private LocalDate kitPrchDate;
    private String kitPrchPlce;
    private LocalDate kitAsmbDate;
    private String kitAsmbTerm;
    private LocalDate kitPntDate;
    private String kitPntTerm;
    private String kitCplPlce;
    private String kitCplStat;
    private String kitNote;
}
