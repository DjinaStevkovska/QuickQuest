package com.quickquest.quickquestapp.service;

import com.quickquest.quickquestapp.model.Quester;
import com.quickquest.quickquestapp.repository.QuesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuesterService {
    private final QuesterRepository questerRepository;

    @Autowired
    public QuesterService(QuesterRepository questerRepository) {
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
