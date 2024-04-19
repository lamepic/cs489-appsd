package edu.miu.apsd.lab7.service.impl;

import edu.miu.apsd.lab7.model.Appointment;
import edu.miu.apsd.lab7.repository.AppointmentRepository;
import edu.miu.apsd.lab7.service.AppointmentService;
import org.springframework.stereotype.Service;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public Appointment addAppointment(Appointment appointment) {
        return this.appointmentRepository.save(appointment);
    }

    @Override
    public Appointment updateAppointment(Integer id, Appointment appointment) {
        Appointment savedAppointment = this.getAppointment(id);
        if(savedAppointment != null){
            return this.appointmentRepository.save(appointment);
        }

        return null;
    }

    @Override
    public Appointment getAppointment(Integer id) {
        return this.appointmentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteAppointment(Integer id) {
        this.appointmentRepository.deleteById(id);
    }
}
