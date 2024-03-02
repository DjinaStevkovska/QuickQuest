package com.quickquest.quickquestapp.api;

import com.quickquest.quickquestapp.model.Quest;
import com.quickquest.quickquestapp.service.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quests")
public class QuestApiAction {
    private final QuestService questService;

    @Autowired
    public QuestApiAction(QuestService questService) {
        this.questService = questService;
    }

    @GetMapping
    public List<Quest> getAllQuests() {
        return questService.getAllQuests();
    }

    @GetMapping("/{id}")
    public Quest getQuestById(@PathVariable Long id) {
        return questService.getQuestById(id)
                .orElseThrow(() -> new RuntimeException("Quest not found"));
    }

    @PostMapping
    public Quest saveQuest(@RequestBody Quest quest) {
        return questService.saveQuest(quest);
    }

    @DeleteMapping("/{id}")
    public void deleteQuestById(@PathVariable Long id) {
        questService.deleteQuestById(id);
    }
}
