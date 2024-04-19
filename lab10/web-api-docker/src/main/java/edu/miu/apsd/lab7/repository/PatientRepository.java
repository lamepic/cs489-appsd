package edu.miu.apsd.lab7.repository;

import edu.miu.apsd.lab7.model.Patient;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

    @Query("SELECT p FROM Patient p WHERE" +
            " LOWER(p.email) LIKE LOWER(CONCAT('%', :search, '%')) OR " +
            " LOWER(p.firstName) LIKE LOWER(CONCAT('%', :search, '%')) OR " +
            " LOWER(p.lastName) LIKE LOWER(CONCAT('%', :search, '%')) OR " +
            " LOWER(p.mailingAddress) LIKE LOWER(CONCAT('%', :search, '%'))")
    List<Patient> searchPatient(String search);
}
