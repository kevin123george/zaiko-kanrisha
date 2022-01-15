package com.hatake.zaikokanrisha.service;

import com.hatake.zaikokanrisha.models.SupplierLogEntity;
import com.hatake.zaikokanrisha.repository.SupplierLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//@Transactional
@Service
public class SupplierLogService {

    @Autowired
    private SupplierLogRepository supplierLogRepository;

    public void insert(SupplierLogEntity supplierLog) {
        supplierLogRepository.save(supplierLog);
    }


    public Optional<SupplierLogEntity> findById(int id) {
        return supplierLogRepository.findById(id);
    }

    public Iterable<SupplierLogEntity> findAll() {
        return supplierLogRepository.findAll();
    }

    public void updateSupplierLog(SupplierLogEntity supplierLog) {
        supplierLogRepository.save(supplierLog);
    }

    public void deleteSupplierLog(SupplierLogEntity supplierLog) {
        supplierLogRepository.delete(supplierLog);
    }



}
