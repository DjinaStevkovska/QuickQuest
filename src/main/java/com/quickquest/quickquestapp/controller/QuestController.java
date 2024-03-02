package com.quickquest.quickquestapp.controller;

import com.quickquest.quickquestapp.model.Quest;
import com.quickquest.quickquestapp.service.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/quests")
public class QuestController {

    private final QuestService questService;

    @Autowired
    public QuestController(QuestService questService) {
        this.questService = questService;
    }

    @GetMapping("/list")
    public String getAllQuests(Model model) {
        List<Quest> quests = questService.getAllQuests();
        model.addAttribute("quests", quests);
        return "quests";
    }
}
