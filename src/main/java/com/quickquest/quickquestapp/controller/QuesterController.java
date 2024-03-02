package com.quickquest.quickquestapp.controller;

import com.quickquest.quickquestapp.model.Quester;
import com.quickquest.quickquestapp.service.QuesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/questers")
public class QuesterController {

    private final QuesterService questerService;

    @Autowired
    public QuesterController(QuesterService questerService) {
        this.questerService = questerService;
    }

    @GetMapping("/list")
    public String getAllQuesters(Model model) {
        List<Quester> questers = questerService.getAllQuesters();
        model.addAttribute("questers", questers);
        return "questers";
    }
}
