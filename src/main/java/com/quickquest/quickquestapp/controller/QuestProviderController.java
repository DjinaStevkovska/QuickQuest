package com.quickquest.quickquestapp.controller;

import com.quickquest.quickquestapp.model.QuestProvider;
import com.quickquest.quickquestapp.service.QuestProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/quest-providers")
public class QuestProviderController {

    private final QuestProviderService questProviderService;

    @Autowired
    public QuestProviderController(QuestProviderService questProviderService) {
        this.questProviderService = questProviderService;
    }

    @GetMapping("/list")
    public String getAllQuestProviders(Model model) {
        List<QuestProvider> questProviders = questProviderService.getAllQuestProviders();
        model.addAttribute("questProviders", questProviders);
        return "quest-providers";
    }
}
