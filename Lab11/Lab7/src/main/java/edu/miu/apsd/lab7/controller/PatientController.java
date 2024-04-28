package edu.miu.apsd.lab7.controller;

import edu.miu.apsd.lab7.dto.CreatePatientDTO;
import edu.miu.apsd.lab7.exception.NotFoundException;
import edu.miu.apsd.lab7.model.Patient;
import edu.miu.apsd.lab7.service.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/patient")
@RestController
public class PatientController {
    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Patient>> getAllPatients() {
        List<Patient> patients = this.patientService.getAllPatient();
        return ResponseEntity.ok(patients);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatient(@PathVariable int id) throws NotFoundException {
        Patient patients = this.patientService.getPatient(id);
        return ResponseEntity.ok(patients);
    }

    @PostMapping("/register")
    public ResponseEntity<Patient> registerPatient(@RequestBody CreatePatientDTO data) {
        Patient patient = this.patientService.addPatient(data);
        return ResponseEntity.ok(patient);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable int id, @RequestBody CreatePatientDTO data)
            throws NotFoundException {
        Patient patient = this.patientService.updatePatient(id, data);
        return ResponseEntity.ok(patient);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePatient(@PathVariable int id) throws NotFoundException {
        this.patientService.deletePatient(id);
        return "Deleted";
    }

    @GetMapping("/search/{search}")
    public ResponseEntity<List<Patient>> search(@PathVariable String search){
        return ResponseEntity.ok(this.patientService.searchPatient(search));
    }

}
