package com.quickquest.quickquestapp.service.impl;

import com.quickquest.quickquestapp.model.QuestProvider;
import com.quickquest.quickquestapp.repository.QuestProviderRepository;
import com.quickquest.quickquestapp.service.QuesterProviderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestProviderServiceImpl implements QuesterProviderService {
    private final QuestProviderRepository questProviderRepository;

    public QuestProviderServiceImpl(QuestProviderRepository questProviderRepository) {
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