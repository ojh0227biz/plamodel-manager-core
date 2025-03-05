package com.plamodel.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PLM_SLD_KIT")
public class PlmSldKit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kitId;
    private String kitGrd;
    private String kitSrs;
    private String kitName;
    private Integer kitPrscPrc;
    private Integer kitLstPrc;
    private Integer kitPrcDiff;
    private LocalDate kitPrchDate;
    private Integer kitSelPrc;
    private Integer kitPftLss;
    private String kitPrchPlce;
    private String kitStgPlce;
    private String kitPairNum;
    private String kitPairName;
    private Boolean kitIsSebl;
    private Boolean kitIsLmt;
    private Boolean kitIsBndMal;
    private String kitDesc;

    public PlmSldKit() {
    }

    public Long getKitId() {
        return kitId;
    }

    public void setKitId(Long kitId) {
        this.kitId = kitId;
    }

    public String getKitGrd() {
        return kitGrd;
    }

    public void setKitGrd(String kitGrd) {
        this.kitGrd = kitGrd;
    }

    public String getKitSrs() {
        return kitSrs;
    }

    public void setKitSrs(String kitSrs) {
        this.kitSrs = kitSrs;
    }

    public String getKitName() {
        return kitName;
    }

    public void setKitName(String kitName) {
        this.kitName = kitName;
    }

    public Integer getKitPrscPrc() {
        return kitPrscPrc;
    }

    public void setKitPrscPrc(Integer kitPrscPrc) {
        this.kitPrscPrc = kitPrscPrc;
    }

    public Integer getKitLstPrc() {
        return kitLstPrc;
    }

    public void setKitLstPrc(Integer kitLstPrc) {
        this.kitLstPrc = kitLstPrc;
    }

    public Integer getKitPrcDiff() {
        return kitPrcDiff;
    }

    public void setKitPrcDiff(Integer kitPrcDiff) {
        this.kitPrcDiff = kitPrcDiff;
    }

    public LocalDate getKitPrchDate() {
        return kitPrchDate;
    }

    public void setKitPrchDate(LocalDate kitPrchDate) {
        this.kitPrchDate = kitPrchDate;
    }

    public Integer getKitSelPrc() {
        return kitSelPrc;
    }

    public void setKitSelPrc(Integer kitSelPrc) {
        this.kitSelPrc = kitSelPrc;
    }

    public Integer getKitPftLss() {
        return kitPftLss;
    }

    public void setKitPftLss(Integer kitPftLss) {
        this.kitPftLss = kitPftLss;
    }

    public String getKitPrchPlce() {
        return kitPrchPlce;
    }

    public void setKitPrchPlce(String kitPrchPlce) {
        this.kitPrchPlce = kitPrchPlce;
    }

    public String getKitStgPlce() {
        return kitStgPlce;
    }

    public void setKitStgPlce(String kitStgPlce) {
        this.kitStgPlce = kitStgPlce;
    }

    public String getKitPairNum() {
        return kitPairNum;
    }

    public void setKitPairNum(String kitPairNum) {
        this.kitPairNum = kitPairNum;
    }

    public String getKitPairName() {
        return kitPairName;
    }

    public void setKitPairName(String kitPairName) {
        this.kitPairName = kitPairName;
    }

    public Boolean getKitIsSebl() {
        return kitIsSebl;
    }

    public void setKitIsSebl(Boolean kitIsSebl) {
        this.kitIsSebl = kitIsSebl;
    }

    public Boolean getKitIsLmt() {
        return kitIsLmt;
    }

    public void setKitIsLmt(Boolean kitIsLmt) {
        this.kitIsLmt = kitIsLmt;
    }

    public Boolean getKitIsBndMal() {
        return kitIsBndMal;
    }

    public void setKitIsBndMal(Boolean kitIsBndMal) {
        this.kitIsBndMal = kitIsBndMal;
    }

    public String getKitDesc() {
        return kitDesc;
    }

    public void setKitDesc(String kitDesc) {
        this.kitDesc = kitDesc;
    }
}
