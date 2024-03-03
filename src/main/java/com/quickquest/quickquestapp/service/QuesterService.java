package com.quickquest.quickquestapp.service;

import com.quickquest.quickquestapp.model.Quester;

import java.util.List;
import java.util.Optional;

public interface QuesterService {

    List<Quester> getAllQuesters();

    Optional<Quester> getQuesterById(Long id);

    Quester saveQuester(Quester quester);

    void deleteQuesterById(Long id);
}
