package edu.miu.apsd.lab6.service;

import edu.miu.apsd.lab6.model.Appointment;

public interface AppointmentService {
    Appointment addAppointment(Appointment appointment);
    Appointment updateAppointment(Integer id, Appointment appointment);
    Appointment getAppointment(Integer id);
    void deleteAppointment(Integer id);
}
