package edu.miu.apsd.lab6.repository;

import edu.miu.apsd.lab6.model.Dentist;
import org.springframework.data.repository.CrudRepository;

public interface DentistRepository extends CrudRepository<Dentist, Integer> {
}
