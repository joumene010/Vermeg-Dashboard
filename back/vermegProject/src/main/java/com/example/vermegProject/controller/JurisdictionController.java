package com.example.vermegProject.controller;

import com.example.vermegProject.model.entity.Jurisdiction;
import com.example.vermegProject.service.JurisdictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/jurisdictions")
public class JurisdictionController {

    @Autowired
    private JurisdictionService jurisdictionService;

    @PostMapping
    public ResponseEntity<Jurisdiction> create(@RequestBody Jurisdiction jurisdiction) {
        Jurisdiction createdJurisdiction = jurisdictionService.create(jurisdiction);
        return ResponseEntity.ok(createdJurisdiction);
    }

    @GetMapping("/{prefix}")
    public ResponseEntity<Jurisdiction> findById(@PathVariable String prefix) {
        Optional<Jurisdiction> jurisdiction = jurisdictionService.findById(prefix);
        return jurisdiction.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Jurisdiction>> findAll() {
        List<Jurisdiction> jurisdictionList = jurisdictionService.findAll();
        return ResponseEntity.ok(jurisdictionList);
    }

    @PutMapping("/{prefix}")
    public ResponseEntity<Jurisdiction> update(@PathVariable String prefix, @RequestBody Jurisdiction jurisdiction) {
        jurisdiction.setPrefix(prefix);
        Jurisdiction updatedJurisdiction = jurisdictionService.update(jurisdiction);
        return ResponseEntity.ok(updatedJurisdiction);
    }

    @DeleteMapping("/{prefix}")
    public ResponseEntity<Void> deleteById(@PathVariable String prefix) {
        jurisdictionService.deleteById(prefix);
        return ResponseEntity.noContent().build();
    }
}