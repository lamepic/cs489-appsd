package edu.miu.apsd.lab6;

import edu.miu.apsd.lab6.model.Appointment;
import edu.miu.apsd.lab6.model.Dentist;
import edu.miu.apsd.lab6.model.Patient;
import edu.miu.apsd.lab6.model.Surgery;
import edu.miu.apsd.lab6.service.AppointmentService;
import edu.miu.apsd.lab6.service.DentistService;
import edu.miu.apsd.lab6.service.PatientService;
import edu.miu.apsd.lab6.service.SurgeryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class Lab6Application implements CommandLineRunner {

    private PatientService patientService;
    private DentistService dentistService;
    private SurgeryService surgeryService;
    private AppointmentService appointmentService;
    Lab6Application(PatientService patientService, DentistService dentistService, SurgeryService surgeryService, AppointmentService appointmentService){
        this.patientService = patientService;
        this.dentistService = dentistService;
        this.surgeryService = surgeryService;
        this.appointmentService = appointmentService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Lab6Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//      ====================  Patients ========================
        var gillian = new Patient(null, "Gillian", "White",
                "1000N 4th st", LocalDate.of(1994, 2, 23),
                "john@gmail.com" , "(233) 889 984", null);
//        var savedGillian = this.patientService.addPatient(gillian);

        var jill = new Patient(null, "Jill", "Bell",
                "1000N 4th st", LocalDate.of(1994, 2, 23),
                "jill@gmail.com" , "(233) 889 984", null);
        var savedJill = this.patientService.addPatient(jill);

        var ian = new Patient(null, "Ian", "MacKay",
                "1000N 4th st", LocalDate.of(1994, 2, 23),
                "ian@gmail.com" , "(233) 889 984", null);
        var savedIan = this.patientService.addPatient(ian);

        var john = new Patient(null, "John", "Walker",
                "1000N 4th st", LocalDate.of(1994, 2, 23),
                "johnwalker@gmail.com" , "(233) 889 984", null);
        var savedJohn = this.patientService.addPatient(john);


//       ================== Dentist ========================
       var tony = new Dentist(null, "Tony", "Smith",
               "tony@gmail.com", "(900) 324 223", "molar", null);
//       var savedTony = this.dentistService.addDentist(tony);

        var helen = new Dentist(null, "Helen", "Pearson",
                "helen@gmail.com", "(900) 324 223", "molar", null);
        var savedHelen = this.dentistService.addDentist(helen);

        var robin = new Dentist(null, "Robin", "Plevin",
                "robin@gmail.com", "(900) 324 223", "molar", null);
        var savedRobin = this.dentistService.addDentist(robin);

//      ======== Surgery =============

       var surgery1 = new Surgery(null, "Mouth", "Ottumwa", "(243) 323 443", null);
//       var savedSurgery1 = this.surgeryService.addSurgery(surgery1);

//     =========== Appointement ===============
       var appointment1 = new Appointment(null, LocalDate.of(2024, 5, 10), LocalTime.of(3, 0), "new York", tony, gillian, surgery1);
       var savedAppointment = this.appointmentService.addAppointment(appointment1);

    }
}
