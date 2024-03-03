package com.quickquest.quickquestapp.service;

import com.quickquest.quickquestapp.model.QuestProvider;

import java.util.List;
import java.util.Optional;

public interface QuesterProviderService {

    List<QuestProvider> getAllQuestProviders();

    Optional<QuestProvider> getQuestProviderById(Long id);

    QuestProvider saveQuestProvider(QuestProvider questProvider);

    void deleteQuestProviderById(Long id);
}
