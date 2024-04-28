package edu.miu.apsd.lab7.service.impl;

import edu.miu.apsd.lab7.model.Surgery;
import edu.miu.apsd.lab7.repository.SurgeryRepository;
import edu.miu.apsd.lab7.service.SurgeryService;
import org.springframework.stereotype.Service;

@Service
public class SurgeryImpl implements SurgeryService {
    private SurgeryRepository surgeryRepository;

    public SurgeryImpl(SurgeryRepository surgeryRepository) {
        this.surgeryRepository = surgeryRepository;
    }

    @Override
    public Surgery addSurgery(Surgery surgery) {
        return this.surgeryRepository.save(surgery);
    }

    @Override
    public Surgery updateSurgery(Integer id, Surgery surgery) {
        Surgery savedSurgery = this.getSurgery(id);
        if(savedSurgery != null){
            return this.surgeryRepository.save(surgery);
        }

        return null;
    }

    @Override
    public Surgery getSurgery(Integer id) {
        return this.surgeryRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteSurgery(Integer id) {
        this.surgeryRepository.deleteById(id);
    }
}
