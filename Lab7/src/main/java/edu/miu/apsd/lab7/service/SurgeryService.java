package edu.miu.apsd.lab7.service;

import edu.miu.apsd.lab7.model.Surgery;

public interface SurgeryService {
    Surgery addSurgery(Surgery surgery);
    Surgery updateSurgery(Integer id, Surgery surgery);
    Surgery getSurgery(Integer id);
    void deleteSurgery(Integer id);
}
