package com.hatake.zaikokanrisha.service;

import com.hatake.zaikokanrisha.models.Category;
import com.hatake.zaikokanrisha.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//import javax.transaction.Transactional;
//import java.util.Optional;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */


//@Transactional
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public void insert(Category category) {
        categoryRepository.save(category);
    }


    public Optional<Category> findById(int id) {
        return categoryRepository.findById(id);
    }

    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    public void updateCategory(Category category) {

        categoryRepository.save(category);
    }

    public void deleteCategory(Integer categoryId) {

        categoryRepository.deleteById(categoryId);
    }
    public void deleteAllCategories() {

        categoryRepository.deleteAll();
    }


}
