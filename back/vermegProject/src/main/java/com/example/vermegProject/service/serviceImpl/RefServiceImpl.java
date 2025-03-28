package com.example.vermegProject.service.serviceImpl;

import com.example.vermegProject.model.entity.Ref;
import com.example.vermegProject.repository.RefRepository;
import com.example.vermegProject.service.RefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class RefServiceImpl implements RefService {

    private static final Logger logger = LoggerFactory.getLogger(RefServiceImpl.class);

    @Autowired
    private RefRepository refRepository;

    @Override
    @Transactional
    public Ref create(@Valid Ref ref) {
        try {
            ref = refRepository.save(ref);
            logger.info("Created Ref: {}", ref);
            return ref;
        } catch (Exception e) {
            logger.error("Error creating Ref: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    public Optional<Ref> findById(Long id) {
        try {
            return refRepository.findById(id);
        } catch (Exception e) {
            logger.error("Error finding Ref by ID: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    public List<Ref> findAll() {
        try {
            return refRepository.findAll();
        } catch (Exception e) {
            logger.error("Error finding all Refs: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    @Transactional
    public Ref update(@Valid Ref ref) {
        try {
            ref = refRepository.save(ref);
            logger.info("Updated Ref: {}", ref);
            return ref;
        } catch (Exception e) {
            logger.error("Error updating Ref: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        try {
            refRepository.deleteById(id);
            logger.info("Deleted Ref with id: {}", id);
        } catch (Exception e) {
            logger.error("Error deleting Ref: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    public List<Ref> findRefsByRetId(Long retId) {
        try {
            return refRepository.findByRetId(retId);
        } catch (Exception e) {
            logger.error("Error finding Refs by RetId: {}", e.getMessage());
            throw e;
        }
    }
}