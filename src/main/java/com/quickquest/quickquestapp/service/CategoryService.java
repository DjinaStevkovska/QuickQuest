package com.quickquest.quickquestapp.service;

import com.quickquest.quickquestapp.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> getAllCategories();

    Optional<Category> getCategoryById(Long id);

    Category saveCategory(Category category);

    void deleteCategoryById(Long id);
}
