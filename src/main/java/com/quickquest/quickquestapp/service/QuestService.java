package com.quickquest.quickquestapp.service;

import com.quickquest.quickquestapp.model.Quest;
import com.quickquest.quickquestapp.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestService {
    private final QuestRepository questRepository;

    @Autowired
    public QuestService(QuestRepository questRepository) {
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

