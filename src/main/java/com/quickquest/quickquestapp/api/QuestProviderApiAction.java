package com.quickquest.quickquestapp.api;

import com.quickquest.quickquestapp.model.QuestProvider;
import com.quickquest.quickquestapp.service.QuestProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quest-providers")
public class QuestProviderApiAction {
    private final QuestProviderService questProviderService;

    @Autowired
    public QuestProviderApiAction(QuestProviderService questProviderService) {
        this.questProviderService = questProviderService;
    }

    @GetMapping
    public List<QuestProvider> getAllQuestProviders() {
        return questProviderService.getAllQuestProviders();
    }

    @GetMapping("/{id}")
    public QuestProvider getQuestProviderById(@PathVariable Long id) {
        return questProviderService.getQuestProviderById(id)
                .orElseThrow(() -> new RuntimeException("Quest Provider not found"));
    }

    @PostMapping
    public QuestProvider saveQuestProvider(@RequestBody QuestProvider questProvider) {
        return questProviderService.saveQuestProvider(questProvider);
    }

    @DeleteMapping("/{id}")
    public void deleteQuestProviderById(@PathVariable Long id) {
        questProviderService.deleteQuestProviderById(id);
    }
}
