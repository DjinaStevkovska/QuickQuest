package com.quickquest.quickquestapp.service.impl;

import com.quickquest.quickquestapp.model.Quest;
import com.quickquest.quickquestapp.repository.QuestRepository;
import com.quickquest.quickquestapp.service.QuestService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestServiceImpl implements QuestService {
    private final QuestRepository questRepository;

    public QuestServiceImpl(QuestRepository questRepository) {
        this.questRepository = questRepository;
    }

    public List<Quest> getAllQuests() {
        return questRepository.findAll();
    }

    public Optional<Quest> getQuestById(Long id) {
        return questRepository.findById(id);
    }

    public Quest saveQuest(Quest quest) {
        // validate entity
        return questRepository.save(quest);
    }

    public void deleteQuestById(Long id) {
        questRepository.deleteById(id);
    }

}

