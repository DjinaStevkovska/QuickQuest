package com.quickquest.quickquestapp.service;

import com.quickquest.quickquestapp.model.Quest;

import java.util.List;
import java.util.Optional;

public interface QuestService {

    List<Quest> getAllQuests();

    Optional<Quest> getQuestById(Long id);

    Quest saveQuest(Quest quest);

    void deleteQuestById(Long id);
}
