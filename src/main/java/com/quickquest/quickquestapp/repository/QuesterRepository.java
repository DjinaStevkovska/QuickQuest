package com.quickquest.quickquestapp.repository;

import com.quickquest.quickquestapp.model.Quester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuesterRepository extends JpaRepository<Quester, Long> {
}

