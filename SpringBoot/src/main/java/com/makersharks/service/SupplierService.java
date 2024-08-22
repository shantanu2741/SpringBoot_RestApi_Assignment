package com.makersharks.service;

import com.makersharks.model.Supplier;
import com.makersharks.model.NatureOfBusiness;
import com.makersharks.model.ManufacturingProcess;
import com.makersharks.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;
    
    public Page<Supplier> findSuppliers(String location, NatureOfBusiness natureOfBusiness, ManufacturingProcess manufacturingProcesses, Pageable pageable) {
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcesses(location, natureOfBusiness, manufacturingProcesses, pageable);
    }
}
