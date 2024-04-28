package edu.miu.apsd.lab7.service;

import edu.miu.apsd.lab7.model.Appointment;

public interface AppointmentService {
    Appointment addAppointment(Appointment appointment);
    Appointment updateAppointment(Integer id, Appointment appointment);
    Appointment getAppointment(Integer id);
    void deleteAppointment(Integer id);
}
