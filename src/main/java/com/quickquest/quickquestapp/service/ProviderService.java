package com.quickquest.quickquestapp.service;

import com.quickquest.quickquestapp.model.Provider;
import com.quickquest.quickquestapp.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderService {

    private final ProviderRepository providerRepository;

    @Autowired
    public ProviderService(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    public List<Provider> getAllProviders() {
        return providerRepository.findAll();
    }

    public Optional<Provider> getProviderById(Long id) {
        return providerRepository.findById(id);
    }

    public Provider saveProvider(Provider provider) {
        // validate
        return providerRepository.save(provider);
    }

    public void deleteProviderById(Long id) {
        providerRepository.deleteById(id);
    }
}
