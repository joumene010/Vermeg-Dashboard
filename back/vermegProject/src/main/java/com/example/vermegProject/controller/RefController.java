package com.example.vermegProject.controller;

import com.example.vermegProject.model.entity.Ref;
import com.example.vermegProject.service.RefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ref")
public class RefController {

    @Autowired
    private RefService refService;

    @PostMapping
    public ResponseEntity<Ref> create(@RequestBody Ref ref) {
        Ref createdRef = refService.create(ref);
        return ResponseEntity.ok(createdRef);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ref> findById(@PathVariable Long id) {
        Optional<Ref> ref = refService.findById(id);
        return ref.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Ref>> findAll() {
        List<Ref> refList = refService.findAll();
        return ResponseEntity.ok(refList);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ref> update(@PathVariable Long id, @RequestBody Ref ref) {
        ref.setId(id);
        Ref updatedRef = refService.update(ref);
        return ResponseEntity.ok(updatedRef);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        refService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}