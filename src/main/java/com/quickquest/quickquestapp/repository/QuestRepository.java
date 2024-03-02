package com.quickquest.quickquestapp.repository;

import com.quickquest.quickquestapp.model.Quest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestRepository extends JpaRepository<Quest, Long> {

}
