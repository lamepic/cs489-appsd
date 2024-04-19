package edu.miu.apsd.lab7.service;

import edu.miu.apsd.lab7.dto.CreatePatientDTO;
import edu.miu.apsd.lab7.exception.NotFoundException;
import edu.miu.apsd.lab7.model.Patient;

import java.util.List;

public interface PatientService {
    Patient addPatient(CreatePatientDTO patient);

    Patient updatePatient(int id, CreatePatientDTO patient) throws NotFoundException;

    Patient getPatient(Integer id) throws NotFoundException;

    void deletePatient(Integer id) throws NotFoundException;

    List<Patient> getAllPatient();

    List<Patient> searchPatient(String search);
}
