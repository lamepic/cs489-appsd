package edu.miu.apsd.lab6.service.impl;

import edu.miu.apsd.lab6.model.Appointment;
import edu.miu.apsd.lab6.model.Dentist;
import edu.miu.apsd.lab6.repository.DentistRepository;
import edu.miu.apsd.lab6.service.DentistService;
import org.springframework.stereotype.Service;

@Service
public class DentistServiceImpl implements DentistService {
    private DentistRepository dentistRepository;

    public DentistServiceImpl(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    @Override
    public Dentist addDentist(Dentist dentist) {
        return this.dentistRepository.save(dentist);
    }

    @Override
    public Dentist updateDentist(Integer id, Dentist dentist) {
        Dentist savedDentist = this.getDentist(id);
        if(savedDentist != null){
            return this.dentistRepository.save(dentist);
        }
        return null;
    }

    @Override
    public Dentist getDentist(Integer id) {
        return this.dentistRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteDentist(Integer id) {
        this.dentistRepository.deleteById(id);
    }
}
