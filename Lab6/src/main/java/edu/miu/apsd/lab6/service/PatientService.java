package edu.miu.apsd.lab6.service;

import edu.miu.apsd.lab6.model.Appointment;
import edu.miu.apsd.lab6.model.Patient;
import org.springframework.stereotype.Service;


public interface PatientService {
    Patient addPatient(Patient patient);
    Patient updatePatient(Integer id, Patient patient);
    Patient getPatient(Integer id);
    void deletePatient(Integer id);
}
