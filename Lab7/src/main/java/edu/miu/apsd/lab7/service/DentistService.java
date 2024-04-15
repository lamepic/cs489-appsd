package edu.miu.apsd.lab7.service;

import edu.miu.apsd.lab7.model.Dentist;

public interface DentistService {
    Dentist addDentist(Dentist dentist);
    Dentist updateDentist(Integer id, Dentist dentist);
    Dentist getDentist(Integer id);
    void deleteDentist(Integer id);
}
