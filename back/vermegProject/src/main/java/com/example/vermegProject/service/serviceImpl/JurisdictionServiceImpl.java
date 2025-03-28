package com.example.vermegProject.service.serviceImpl;

import com.example.vermegProject.model.entity.Jurisdiction;
import com.example.vermegProject.repository.JurisdictionRepository;
import com.example.vermegProject.service.JurisdictionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

@Service
public class JurisdictionServiceImpl implements JurisdictionService {

    private static final Logger logger = LoggerFactory.getLogger(JurisdictionServiceImpl.class);

    @Autowired
    private JurisdictionRepository jurisdictionRepository;

    @Override
    @Transactional
    public Jurisdiction create(@Valid Jurisdiction jurisdiction) {
        try {
            jurisdiction = jurisdictionRepository.save(jurisdiction);
            logger.info("Created Jurisdiction: {}", jurisdiction);
            return jurisdiction;
        } catch (Exception e) {
            logger.error("Error creating Jurisdiction: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    public Optional<Jurisdiction> findById(String prefix) {
        try {
            return jurisdictionRepository.findById(prefix);
        } catch (Exception e) {
            logger.error("Error finding Jurisdiction by ID: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    public List<Jurisdiction> findAll() {
        try {
            return jurisdictionRepository.findAll();
        } catch (Exception e) {
            logger.error("Error finding all Jurisdictions: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    @Transactional
    public Jurisdiction update(@Valid Jurisdiction jurisdiction) {
        try {
            jurisdiction = jurisdictionRepository.save(jurisdiction);
            logger.info("Updated Jurisdiction: {}", jurisdiction);
            return jurisdiction;
        } catch (Exception e) {
            logger.error("Error updating Jurisdiction: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    @Transactional
    public void deleteById(String prefix) {
        try {
            jurisdictionRepository.deleteById(prefix);
            logger.info("Deleted Jurisdiction with prefix: {}", prefix);
        } catch (Exception e) {
            logger.error("Error deleting Jurisdiction: {}", e.getMessage());
            throw e;
        }
    }
}