package com.quickquest.quickquestapp.api;

import com.quickquest.quickquestapp.model.Category;
import com.quickquest.quickquestapp.service.impl.CategoryServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryApiAction {
    private final CategoryServiceImpl categoryServiceImpl;

    public CategoryApiAction(CategoryServiceImpl categoryServiceImpl) {
        this.categoryServiceImpl = categoryServiceImpl;
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryServiceImpl.getAllCategories();
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id) {
        return categoryServiceImpl.getCategoryById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));
    }

    @PostMapping
    public Category saveCategory(@RequestBody Category category) {
        return categoryServiceImpl.saveCategory(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategoryById(@PathVariable Long id) {
        categoryServiceImpl.deleteCategoryById(id);
    }
}
