package com.plamodel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PLM_PLN_PCHS_KIT")
public class PlmPlnPchsKit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kitId;
    private String kitGrd;
    private String kitSrs;
    private String kitName;
    private Integer kitPrscPrc;
    private Integer kitLstPrc;
    private Integer kitPrcDiff;
    private String kitUrl;
    private Integer kitPrio;
    private String kitPair;
}
