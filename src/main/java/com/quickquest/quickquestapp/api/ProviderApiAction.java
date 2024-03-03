package com.quickquest.quickquestapp.api;

import com.quickquest.quickquestapp.model.Provider;
import com.quickquest.quickquestapp.service.impl.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/providers")
public class ProviderApiAction {
    private final ProviderServiceImpl providerServiceImpl;

    @Autowired
    public ProviderApiAction(ProviderServiceImpl providerServiceImpl) {
        this.providerServiceImpl = providerServiceImpl;
    }

    @GetMapping
    public List<Provider> getAllProviders() {
        return providerServiceImpl.getAllProviders();
    }

    @GetMapping("/{id}")
    public Provider getProviderById(@PathVariable Long id) {
        return providerServiceImpl.getProviderById(id)
                .orElseThrow(() -> new RuntimeException("Provider not found"));
    }

    @PostMapping
    public Provider saveProvider(@RequestBody Provider provider) {
        return providerServiceImpl.saveProvider(provider);
    }

    @DeleteMapping("/{id}")
    public void deleteProviderById(@PathVariable Long id) {
        providerServiceImpl.deleteProviderById(id);
    }
}
