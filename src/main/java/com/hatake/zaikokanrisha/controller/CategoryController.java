package com.hatake.zaikokanrisha.controller;

import com.hatake.zaikokanrisha.models.Category;
import com.hatake.zaikokanrisha.models.TheLogConverter;
import com.hatake.zaikokanrisha.service.CategoryLogService;
import com.hatake.zaikokanrisha.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    public CategoryService categoryService;
    @Autowired
    private CategoryLogService categoryLogService;

    @GetMapping("")
    public Iterable<Category> getAllCategory() {
        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Category> searchCategory(@PathVariable Integer id) {
        return categoryService.findById(id);
    }

    @PostMapping(value = "")
    public void addCategory(@RequestBody Category category) {
        categoryService.insert(category);
//        categoryLogService.insert(TheLogConverter.categoryLogConverter(category));
    }

    @PutMapping(value ="/{id}")
    public void updateCategory(@RequestBody Category category) {
        categoryService.updateCategory(category);
//        categoryLogService.insert(TheLogConverter.categoryLogConverter(category));
    }

    @DeleteMapping(value ="/{id}")
    public void deleteCategory(@PathVariable Integer id) {
        categoryService.deleteCategory(id);
//        categoryLogService.insert(TheLogConverter.categoryLogConverter(category));
    }
    @DeleteMapping(value ="/delete/all")
    public void deleteCategory() {
        categoryService.deleteAllCategories();
//        categoryLogService.insert(TheLogConverter.categoryLogConverter(category));
    }


}
