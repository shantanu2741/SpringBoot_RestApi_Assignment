package com.makersharks.controller;

import com.makersharks.model.Supplier;
import com.makersharks.model.NatureOfBusiness;
import com.makersharks.model.ManufacturingProcess;
import com.makersharks.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;
    
    @PostMapping("/query")
    public ResponseEntity<Page<Supplier>> querySuppliers(
        @RequestParam String location, 
        @RequestParam NatureOfBusiness natureOfBusiness, 
        @RequestParam ManufacturingProcess manufacturingProcesses,
        @RequestParam int page, 
        @RequestParam int size) {
        
        Pageable pageable = PageRequest.of(page, size);
        Page<Supplier> suppliers = supplierService.findSuppliers(location, natureOfBusiness, manufacturingProcesses, pageable);
        return ResponseEntity.ok(suppliers);
    }
}

