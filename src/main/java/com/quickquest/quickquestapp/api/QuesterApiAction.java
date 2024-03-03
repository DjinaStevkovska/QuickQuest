package com.quickquest.quickquestapp.api;

import com.quickquest.quickquestapp.model.Quester;
import com.quickquest.quickquestapp.service.impl.QuesterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questers")
public class QuesterApiAction {
    private final QuesterServiceImpl questerServiceImpl;

    @Autowired
    public QuesterApiAction(QuesterServiceImpl questerServiceImpl) {
        this.questerServiceImpl = questerServiceImpl;
    }

    @GetMapping
    public List<Quester> getAllQuesters() {
        return questerServiceImpl.getAllQuesters();
    }

    @GetMapping("/{id}")
    public Quester getQuesterById(@PathVariable Long id) {
        return questerServiceImpl.getQuesterById(id)
                .orElseThrow(() -> new RuntimeException("Quester not found"));
    }

    @PostMapping
    public Quester saveQuester(@RequestBody Quester quester) {
        return questerServiceImpl.saveQuester(quester);
    }

    @DeleteMapping("/{id}")
    public void deleteQuesterById(@PathVariable Long id) {
        questerServiceImpl.deleteQuesterById(id);
    }
}
