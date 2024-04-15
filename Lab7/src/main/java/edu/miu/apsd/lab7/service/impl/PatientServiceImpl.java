package edu.miu.apsd.lab7.service.impl;

import edu.miu.apsd.lab7.dto.CreatePatientDTO;
import edu.miu.apsd.lab7.exception.NotFoundException;
import edu.miu.apsd.lab7.model.Patient;
import edu.miu.apsd.lab7.repository.PatientRepository;
import edu.miu.apsd.lab7.service.PatientService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient addPatient(CreatePatientDTO patient) {
        Patient newPatient = Patient.builder()
                .id(null)
                .firstName(patient.firstName())
                .lastName(patient.lastName())
                .email(patient.email())
                .dateOfBirth(patient.dateOfBirth())
                .phoneNumber(patient.phoneNumber())
                .mailingAddress(patient.mailingAddress()).build();

        return patientRepository.save(newPatient);
    }

    @Override
    public Patient updatePatient(int id, CreatePatientDTO patient) throws NotFoundException {
        Patient savedPatient = this.getPatient(id);
        savedPatient.setFirstName(patient.firstName());
        savedPatient.setLastName(patient.lastName());
        savedPatient.setEmail(patient.email());
        savedPatient.setPhoneNumber(patient.phoneNumber());
        savedPatient.setMailingAddress(patient.mailingAddress());
        savedPatient.setDateOfBirth(patient.dateOfBirth());
        return this.patientRepository.save(savedPatient);
    }

    @Override
    public Patient getPatient(Integer id) throws NotFoundException {
        return this.patientRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Patient with %d does not exist", id)));
    }

    @Override
    public void deletePatient(Integer id) throws NotFoundException {
        this.getPatient(id);
        this.patientRepository.deleteById(id);
    }

    @Override
    public List<Patient> getAllPatient() {
        return this.patientRepository.findAll(Sort.by("lastName")).stream().toList();
    }

    @Override
    public List<Patient> searchPatient(String search) {
        return this.patientRepository.searchPatient(search);
    }

}
