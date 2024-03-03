package com.quickquest.quickquestapp.controller;

import com.quickquest.quickquestapp.model.QuestProvider;
import com.quickquest.quickquestapp.service.impl.QuestProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/quest-providers")
public class QuestProviderController {

    private final QuestProviderServiceImpl questProviderServiceImpl;

    public QuestProviderController(QuestProviderServiceImpl questProviderServiceImpl) {
        this.questProviderServiceImpl = questProviderServiceImpl;
    }

    @GetMapping("/list")
    public String getAllQuestProviders(Model model) {
        List<QuestProvider> questProviders = questProviderServiceImpl.getAllQuestProviders();
        model.addAttribute("questProviders", questProviders);
        return "quest-providers";
    }
}
