package com.example.vermegProject.service.serviceImpl;

import com.example.vermegProject.model.entity.Cref;
import com.example.vermegProject.repository.CrefRepository;
import com.example.vermegProject.service.CrefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class CrefServiceImpl implements CrefService {

    private static final Logger logger = LoggerFactory.getLogger(CrefServiceImpl.class);

    @Autowired
    private CrefRepository crefRepository;

    @Override
    @Transactional
    public Cref create(@Valid Cref cref) {
        try {
            cref = crefRepository.save(cref);
            logger.info("Created Cref: {}", cref);
            return cref;
        } catch (Exception e) {
            logger.error("Error creating Cref: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    public Optional<Cref> findById(Long id) {
        try {
            return crefRepository.findById(id);
        } catch (Exception e) {
            logger.error("Error finding Cref by ID: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    public List<Cref> findAll() {
        try {
            return crefRepository.findAll();
        } catch (Exception e) {
            logger.error("Error finding all Crefs: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    @Transactional
    public Cref update(@Valid Cref cref) {
        try {
            cref = crefRepository.save(cref);
            logger.info("Updated Cref: {}", cref);
            return cref;
        } catch (Exception e) {
            logger.error("Error updating Cref: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        try {
            crefRepository.deleteById(id);
            logger.info("Deleted Cref with id: {}", id);
        } catch (Exception e) {
            logger.error("Error deleting Cref: {}", e.getMessage());
            throw e;
        }
    }
}