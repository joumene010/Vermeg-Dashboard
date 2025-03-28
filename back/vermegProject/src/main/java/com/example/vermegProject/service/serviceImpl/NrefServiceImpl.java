package com.example.vermegProject.service.serviceImpl;

import com.example.vermegProject.model.entity.Nref;
import com.example.vermegProject.repository.NrefRepository;
import com.example.vermegProject.service.NrefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class NrefServiceImpl implements NrefService {

    private static final Logger logger = LoggerFactory.getLogger(NrefServiceImpl.class);

    @Autowired
    private NrefRepository nrefRepository;

    @Override
    @Transactional
    public Nref create(@Valid Nref nref) {
        try {
            nref = nrefRepository.save(nref);
            logger.info("Created Nref: {}", nref);
            return nref;
        } catch (Exception e) {
            logger.error("Error creating Nref: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    public Optional<Nref> findById(Long id) {
        try {
            return nrefRepository.findById(id);
        } catch (Exception e) {
            logger.error("Error finding Nref by ID: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    public List<Nref> findAll() {
        try {
            return nrefRepository.findAll();
        } catch (Exception e) {
            logger.error("Error finding all Nrefs: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    @Transactional
    public Nref update(@Valid Nref nref) {
        try {
            nref = nrefRepository.save(nref);
            logger.info("Updated Nref: {}", nref);
            return nref;
        } catch (Exception e) {
            logger.error("Error updating Nref: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        try {
            nrefRepository.deleteById(id);
            logger.info("Deleted Nref with id: {}", id);
        } catch (Exception e) {
            logger.error("Error deleting Nref: {}", e.getMessage());
            throw e;
        }
    }
}