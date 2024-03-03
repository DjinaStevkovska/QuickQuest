package com.quickquest.quickquestapp.service.impl;

import com.quickquest.quickquestapp.model.Provider;
import com.quickquest.quickquestapp.repository.ProviderRepository;
import com.quickquest.quickquestapp.service.ProviderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderServiceImpl implements ProviderService {

    private final ProviderRepository providerRepository;

    public ProviderServiceImpl(ProviderRepository providerRepository) {
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
