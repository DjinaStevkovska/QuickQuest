package com.quickquest.quickquestapp.controller;

import com.quickquest.quickquestapp.model.Quest;
import com.quickquest.quickquestapp.service.impl.QuestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/quests")
public class QuestController {

    private final QuestServiceImpl questServiceImpl;

    public QuestController(QuestServiceImpl questServiceImpl) {
        this.questServiceImpl = questServiceImpl;
    }

    @GetMapping("/list")
    public String getAllQuests(Model model) {
        List<Quest> quests = questServiceImpl.getAllQuests();
        model.addAttribute("quests", quests);
        return "quests";
    }
}
