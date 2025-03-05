package com.plamodel.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plamodel.entity.PlmPlnSaleKit;
import com.plamodel.repository.PlmPlnSaleKitRepository;

@RestController
@RequestMapping("/api/planned-sale-kits")
public class PlmPlnSaleKitController {
    private final PlmPlnSaleKitRepository plmPlnSaleKitRepository;

    public PlmPlnSaleKitController(PlmPlnSaleKitRepository plmPlnSaleKitRepository) {
        this.plmPlnSaleKitRepository = plmPlnSaleKitRepository;
    }

    @GetMapping
    public List<PlmPlnSaleKit> getAllPlannedSaleKits() {
        return plmPlnSaleKitRepository.findAll();
    }
}