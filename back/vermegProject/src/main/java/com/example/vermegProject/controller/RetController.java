package com.example.vermegProject.controller;

import com.example.vermegProject.model.entity.Ret;
import com.example.vermegProject.service.RetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ret")
public class RetController {

    @Autowired
    private RetService retService;

    @PostMapping
    public ResponseEntity<Ret> create(@RequestBody Ret ret) {
        Ret createdRet = retService.create(ret);
        return ResponseEntity.ok(createdRet);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ret> findById(@PathVariable Long id) {
        Optional<Ret> ret = retService.findById(id);
        return ret.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Ret>> findAll() {
        List<Ret> retList = retService.findAll();
        return ResponseEntity.ok(retList);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ret> update(@PathVariable Long id, @RequestBody Ret ret) {
        ret.setId(id);
        Ret updatedRet = retService.update(ret);
        return ResponseEntity.ok(updatedRet);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        retService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}