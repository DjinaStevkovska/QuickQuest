package com.quickquest.quickquestapp.api;

import com.quickquest.quickquestapp.model.Quest;
import com.quickquest.quickquestapp.service.impl.QuestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quests")
public class QuestApiAction {
    private final QuestServiceImpl questServiceImpl;

    @Autowired
    public QuestApiAction(QuestServiceImpl questServiceImpl) {
        this.questServiceImpl = questServiceImpl;
    }

    @GetMapping
    public List<Quest> getAllQuests() {
        return questServiceImpl.getAllQuests();
    }

    @GetMapping("/{id}")
    public Quest getQuestById(@PathVariable Long id) {
        return questServiceImpl.getQuestById(id)
                .orElseThrow(() -> new RuntimeException("Quest not found"));
    }

    @PostMapping
    public Quest saveQuest(@RequestBody Quest quest) {
        return questServiceImpl.saveQuest(quest);
    }

    @DeleteMapping("/{id}")
    public void deleteQuestById(@PathVariable Long id) {
        questServiceImpl.deleteQuestById(id);
    }
}
