package edu.miu.apsd.lab7;

import edu.miu.apsd.lab7.exception.NotFoundException;
import edu.miu.apsd.lab7.service.PatientService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class Lab6ApplicationTests {

    @Autowired
    private PatientService patientService;

    @Test
    void testGetPatientExist() {
        var patient = patientService.getPatient(1);
        Assertions.assertNotNull(patient);
    }

    @Test
    void testGetPatientDoesNotExist() throws NotFoundException {
        var patient = patientService.getPatient(143);
        Assertions.assertNull(patient);
    }

}
