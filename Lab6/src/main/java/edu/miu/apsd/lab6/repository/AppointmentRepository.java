package edu.miu.apsd.lab6.repository;

import edu.miu.apsd.lab6.model.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository  extends CrudRepository<Appointment, Integer> {
}
