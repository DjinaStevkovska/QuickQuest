package com.quickquest.quickquestapp.service.impl;

import com.quickquest.quickquestapp.model.Quester;
import com.quickquest.quickquestapp.repository.QuesterRepository;
import com.quickquest.quickquestapp.service.QuesterService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuesterServiceImpl implements QuesterService {
    private final QuesterRepository questerRepository;

    public QuesterServiceImpl(QuesterRepository questerRepository) {
        this.questerRepository = questerRepository;
    }

    public List<Quester> getAllQuesters() {
        return questerRepository.findAll();
    }

    public Optional<Quester> getQuesterById(Long id) {
        return questerRepository.findById(id);
    }

    public Quester saveQuester(Quester quester) {
        // validat
        return questerRepository.save(quester);
    }

    public void deleteQuesterById(Long id) {
        questerRepository.deleteById(id);
    }
}
