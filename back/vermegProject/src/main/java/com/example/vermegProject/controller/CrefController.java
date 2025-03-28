package com.example.vermegProject.controller;

import com.example.vermegProject.model.entity.Cref;
import com.example.vermegProject.service.CrefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cref")
public class CrefController {

    @Autowired
    private CrefService crefService;

    @PostMapping
    public ResponseEntity<Cref> create(@RequestBody Cref cref) {
        Cref createdCref = crefService.create(cref);
        return ResponseEntity.ok(createdCref);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cref> findById(@PathVariable Long id) {
        Optional<Cref> cref = crefService.findById(id);
        return cref.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Cref>> findAll() {
        List<Cref> crefList = crefService.findAll();
        return ResponseEntity.ok(crefList);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cref> update(@PathVariable Long id, @RequestBody Cref cref) {
        cref.setId(id);
        Cref updatedCref = crefService.update(cref);
        return ResponseEntity.ok(updatedCref);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        crefService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}