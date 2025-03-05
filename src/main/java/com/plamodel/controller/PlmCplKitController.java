package com.plamodel.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plamodel.entity.PlmCplKit;
import com.plamodel.repository.PlmCplKitRepository;

@RestController
@RequestMapping("/api/completed-kits")
public class PlmCplKitController {
    private final PlmCplKitRepository plmCplKitRepository;

    public PlmCplKitController(PlmCplKitRepository plmCplKitRepository) {
        this.plmCplKitRepository = plmCplKitRepository;
    }

    @GetMapping
    public List<PlmCplKit> getAllCompletedKits() {
        return plmCplKitRepository.findAll();
    }
}