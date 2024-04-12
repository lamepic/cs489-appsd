package edu.miu.apsd.lab6.service;

import edu.miu.apsd.lab6.model.Appointment;
import edu.miu.apsd.lab6.model.Surgery;

public interface SurgeryService {
    Surgery addSurgery(Surgery surgery);
    Surgery updateSurgery(Integer id, Surgery surgery);
    Surgery getSurgery(Integer id);
    void deleteSurgery(Integer id);
}
