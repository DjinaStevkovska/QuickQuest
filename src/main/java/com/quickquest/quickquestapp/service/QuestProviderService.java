package com.quickquest.quickquestapp.service;

import com.quickquest.quickquestapp.model.QuestProvider;
import com.quickquest.quickquestapp.repository.QuestProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestProviderService {
    private final QuestProviderRepository questProviderRepository;

    @Autowired
    public QuestProviderService(QuestProviderRepository questProviderRepository) {
        this.questProviderRepository = questProviderRepository;
    }

    public List<QuestProvider> getAllQuestProviders() {
        return questProviderRepository.findAll();
    }

    public Optional<QuestProvider> getQuestProviderById(Long id) {
        return questProviderRepository.findById(id);
    }

    public QuestProvider saveQuestProvider(QuestProvider questProvider) {
        return questProviderRepository.save(questProvider);
    }

    public void deleteQuestProviderById(Long id) {
        questProviderRepository.deleteById(id);
    }
}