package com.quickquest.quickquestapp.api;

import com.quickquest.quickquestapp.model.Quester;
import com.quickquest.quickquestapp.service.QuesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questers")
public class QuesterApiAction {
    private final QuesterService questerService;

    @Autowired
    public QuesterApiAction(QuesterService questerService) {
        this.questerService = questerService;
    }

    @GetMapping
    public List<Quester> getAllQuesters() {
        return questerService.getAllQuesters();
    }

    @GetMapping("/{id}")
    public Quester getQuesterById(@PathVariable Long id) {
        return questerService.getQuesterById(id)
                .orElseThrow(() -> new RuntimeException("Quester not found"));
    }

    @PostMapping
    public Quester saveQuester(@RequestBody Quester quester) {
        return questerService.saveQuester(quester);
    }

    @DeleteMapping("/{id}")
    public void deleteQuesterById(@PathVariable Long id) {
        questerService.deleteQuesterById(id);
    }
}
