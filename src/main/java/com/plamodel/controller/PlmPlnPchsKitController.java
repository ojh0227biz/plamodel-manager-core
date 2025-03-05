package com.plamodel.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plamodel.entity.PlmPlnPchsKit;
import com.plamodel.repository.PlmPlnPchsKitRepository;

@RestController
@RequestMapping("/api/planned-purchase-kits")
public class PlmPlnPchsKitController {
    private final PlmPlnPchsKitRepository plmPlnPchsKitRepository;

    public PlmPlnPchsKitController(PlmPlnPchsKitRepository plmPlnPchsKitRepository) {
        this.plmPlnPchsKitRepository = plmPlnPchsKitRepository;
    }

    @GetMapping
    public List<PlmPlnPchsKit> getAllPlannedPurchaseKits() {
        return plmPlnPchsKitRepository.findAll();
    }
}