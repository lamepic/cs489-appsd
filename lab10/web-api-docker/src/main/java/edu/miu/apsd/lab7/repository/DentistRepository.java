package edu.miu.apsd.lab7.repository;

import edu.miu.apsd.lab7.model.Dentist;
import org.springframework.data.repository.CrudRepository;

public interface DentistRepository extends CrudRepository<Dentist, Integer> {
}
