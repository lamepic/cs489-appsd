package edu.miu.apsd.lab6.service.impl;

import edu.miu.apsd.lab6.model.Appointment;
import edu.miu.apsd.lab6.model.Patient;
import edu.miu.apsd.lab6.repository.PatientRepository;
import edu.miu.apsd.lab6.service.PatientService;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient updatePatient(Integer id, Patient patient) {
        Patient savedPatient = this.getPatient(id);
        if(savedPatient != null){
            return this.patientRepository.save(patient);
        }

        return null;
    }

    @Override
    public Patient getPatient(Integer id) {
        return this.patientRepository.findById(id).orElse(null);
    }

    @Override
    public void deletePatient(Integer id) {
        this.patientRepository.deleteById(id);
    }
}
