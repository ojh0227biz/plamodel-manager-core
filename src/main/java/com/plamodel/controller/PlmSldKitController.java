package com.plamodel.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plamodel.entity.PlmSldKit;
import com.plamodel.mapper.PlmSldKitMapper;

@CrossOrigin(origins = "http://localhost:13589")
@RestController
@RequestMapping("/api/sealed-kits")
public class PlmSldKitController {

    private final PlmSldKitMapper plmSldKitMapper;

    public PlmSldKitController(PlmSldKitMapper plmSldKitMapper) {
        this.plmSldKitMapper = plmSldKitMapper;
    }

    @GetMapping
    public List<PlmSldKit> getAllSealedKits() {
        return plmSldKitMapper.selectAll();
    }
}
