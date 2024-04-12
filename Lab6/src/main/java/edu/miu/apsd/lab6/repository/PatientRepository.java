package edu.miu.apsd.lab6.repository;

import edu.miu.apsd.lab6.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Integer> {
}
