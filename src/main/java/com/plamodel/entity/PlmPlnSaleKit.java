package com.plamodel.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PLM_SLD_KIT")
public class PlmPlnSaleKit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kitId;
    private String kitGrd;
    private String kitSrs;
    private String kitName;
    private Integer kitPrscPrc;
    private LocalDate kitPrchDate;
    private Integer kitExpSelPrc;
    private Integer kitPftLss;
    private LocalDate kitSelDate;
    private String kitPrchPlce;
    private String kitStgPlce;
    private Integer kitPrio;
    private String kitPairNum;
    private String kitPairName;
}
