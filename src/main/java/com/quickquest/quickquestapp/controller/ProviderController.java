package com.quickquest.quickquestapp.controller;

import com.quickquest.quickquestapp.model.Provider;
import com.quickquest.quickquestapp.service.impl.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/providers")
public class ProviderController {

    private final ProviderServiceImpl providerServiceImpl;


    public ProviderController(ProviderServiceImpl providerServiceImpl) {
        this.providerServiceImpl = providerServiceImpl;
    }

    @GetMapping("/list")
    public String getAllProviders(Model model) {
        List<Provider> providers = providerServiceImpl.getAllProviders();
        model.addAttribute("providers", providers);
        return "providers";
    }
}
