package com.hatake.zaikokanrisha.repository;

import com.hatake.zaikokanrisha.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM category")
    Iterable<Category> getAllCategory();

}
