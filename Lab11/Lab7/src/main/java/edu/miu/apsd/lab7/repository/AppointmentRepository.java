package edu.miu.apsd.lab7.repository;

import edu.miu.apsd.lab7.model.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository  extends CrudRepository<Appointment, Integer> {
}
