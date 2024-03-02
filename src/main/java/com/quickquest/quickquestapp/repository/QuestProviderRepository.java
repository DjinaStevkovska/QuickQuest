package com.quickquest.quickquestapp.repository;

import com.quickquest.quickquestapp.model.QuestProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestProviderRepository extends JpaRepository<QuestProvider, Long> {
}
