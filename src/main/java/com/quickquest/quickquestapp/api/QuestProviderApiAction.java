package com.quickquest.quickquestapp.api;

import com.quickquest.quickquestapp.model.QuestProvider;
import com.quickquest.quickquestapp.service.impl.QuestProviderServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quest-providers")
public class QuestProviderApiAction {
    private final QuestProviderServiceImpl questProviderServiceImpl;

    public QuestProviderApiAction(QuestProviderServiceImpl questProviderServiceImpl) {
        this.questProviderServiceImpl = questProviderServiceImpl;
    }

    @GetMapping
    public List<QuestProvider> getAllQuestProviders() {
        return questProviderServiceImpl.getAllQuestProviders();
    }

    @GetMapping("/{id}")
    public QuestProvider getQuestProviderById(@PathVariable Long id) {
        return questProviderServiceImpl.getQuestProviderById(id)
                .orElseThrow(() -> new RuntimeException("Quest Provider not found"));
    }

    @PostMapping
    public QuestProvider saveQuestProvider(@RequestBody QuestProvider questProvider) {
        return questProviderServiceImpl.saveQuestProvider(questProvider);
    }

    @DeleteMapping("/{id}")
    public void deleteQuestProviderById(@PathVariable Long id) {
        questProviderServiceImpl.deleteQuestProviderById(id);
    }
}
