package com.quickquest.quickquestapp.api;

import com.quickquest.quickquestapp.model.Provider;
import com.quickquest.quickquestapp.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/providers")
public class ProviderApiAction {
    private final ProviderService providerService;

    @Autowired
    public ProviderApiAction(ProviderService providerService) {
        this.providerService = providerService;
    }

    @GetMapping
    public List<Provider> getAllProviders() {
        return providerService.getAllProviders();
    }

    @GetMapping("/{id}")
    public Provider getProviderById(@PathVariable Long id) {
        return providerService.getProviderById(id)
                .orElseThrow(() -> new RuntimeException("Provider not found"));
    }

    @PostMapping
    public Provider saveProvider(@RequestBody Provider provider) {
        return providerService.saveProvider(provider);
    }

    @DeleteMapping("/{id}")
    public void deleteProviderById(@PathVariable Long id) {
        providerService.deleteProviderById(id);
    }
}
