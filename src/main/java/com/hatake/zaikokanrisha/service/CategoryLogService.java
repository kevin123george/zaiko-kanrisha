package com.hatake.zaikokanrisha.service;

//import com.example.entity.CategoryLogEntity;
//import com.example.repository.CategoryLogRepository;

import com.hatake.zaikokanrisha.models.CategoryLogEntity;
import com.hatake.zaikokanrisha.repository.CategoryLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//@Transactional
@Service
public class CategoryLogService {
    @Autowired
    private CategoryLogRepository categoryLogRepository;

    public void insert(CategoryLogEntity categoryLog) {
        categoryLogRepository.save(categoryLog);
    }


    public Optional<CategoryLogEntity> findById(Integer id) {
        return categoryLogRepository.findById(id);
    }

    public Iterable<CategoryLogEntity> findAll() {
        return categoryLogRepository.findAll();
    }

    public void updateCategoryLog(CategoryLogEntity categoryLog) {
        categoryLogRepository.save(categoryLog);
    }

    public void deleteCategoryLog(CategoryLogEntity categoryLog) {
        categoryLogRepository.delete(categoryLog);
    }




}
