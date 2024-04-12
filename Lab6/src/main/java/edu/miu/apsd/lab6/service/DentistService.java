package edu.miu.apsd.lab6.service;

import edu.miu.apsd.lab6.model.Dentist;

public interface DentistService {
    Dentist addDentist(Dentist dentist);
    Dentist updateDentist(Integer id, Dentist dentist);
    Dentist getDentist(Integer id);
    void deleteDentist(Integer id);
}
