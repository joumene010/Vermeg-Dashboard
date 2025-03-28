package com.example.vermegProject.service.serviceImpl;

import com.example.vermegProject.model.entity.Ret;
import com.example.vermegProject.repository.RetRepository;
import com.example.vermegProject.service.RetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class RetServiceImpl implements RetService {

    private static final Logger logger = LoggerFactory.getLogger(RetServiceImpl.class);

    @Autowired
    private RetRepository retRepository;

    @Override
    @Transactional
    public Ret create(@Valid Ret ret) {
        try {
            ret = retRepository.save(ret);
            logger.info("Created Ret: {}", ret);
            return ret;
        } catch (Exception e) {
            logger.error("Error creating Ret: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    public Optional<Ret> findById(Long id) {
        try {
            return retRepository.findById(id);
        } catch (Exception e) {
            logger.error("Error finding Ret by ID: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    public List<Ret> findAll() {
        try {
            return retRepository.findAll();
        } catch (Exception e) {
            logger.error("Error finding all Rets: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    @Transactional
    public Ret update(@Valid Ret ret) {
        try {
            ret = retRepository.save(ret);
            logger.info("Updated Ret: {}", ret);
            return ret;
        } catch (Exception e) {
            logger.error("Error updating Ret: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        try {
            retRepository.deleteById(id);
            logger.info("Deleted Ret with id: {}", id);
        } catch (Exception e) {
            logger.error("Error deleting Ret: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    public List<Ret> getRetByJurisdictionId(String id) {
        try {
            return retRepository.findByJurisdictionId(id);
        } catch (Exception e) {
            logger.error("Error finding Rets by JurisdictionId: {}", e.getMessage());
            throw e;
        }
    }
}