package com.quickquest.quickquestapp.controller;

import com.quickquest.quickquestapp.model.Category;
import com.quickquest.quickquestapp.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryServiceImpl categoryServiceImpl;

    public CategoryController(CategoryServiceImpl categoryServiceImpl) {
        this.categoryServiceImpl = categoryServiceImpl;
    }

    @GetMapping("/list")
    public String getAllCategories(Model model) {
        List<Category> categories = categoryServiceImpl.getAllCategories();
        model.addAttribute("categories", categories);
        return "categories";
    }
}
