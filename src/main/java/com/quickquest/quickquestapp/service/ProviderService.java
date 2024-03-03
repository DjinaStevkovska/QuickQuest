package com.quickquest.quickquestapp.service;

import com.quickquest.quickquestapp.model.Provider;

import java.util.List;
import java.util.Optional;

public interface ProviderService {

    List<Provider> getAllProviders();

    Optional<Provider> getProviderById(Long id);

    Provider saveProvider(Provider provider);

    void deleteProviderById(Long id);
}
