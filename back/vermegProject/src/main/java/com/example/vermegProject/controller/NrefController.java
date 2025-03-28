package com.example.vermegProject.controller;

import com.example.vermegProject.model.entity.Nref;
import com.example.vermegProject.service.NrefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/nref")
public class NrefController {

    @Autowired
    private NrefService nrefService;

    @PostMapping
    public ResponseEntity<Nref> create(@RequestBody Nref nref) {
        Nref createdNref = nrefService.create(nref);
        return ResponseEntity.ok(createdNref);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Nref> findById(@PathVariable Long id) {
        Optional<Nref> nref = nrefService.findById(id);
        return nref.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Nref>> findAll() {
        List<Nref> nrefList = nrefService.findAll();
        return ResponseEntity.ok(nrefList);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Nref> update(@PathVariable Long id, @RequestBody Nref nref) {
        nref.setId(id);
        Nref updatedNref = nrefService.update(nref);
        return ResponseEntity.ok(updatedNref);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        nrefService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}