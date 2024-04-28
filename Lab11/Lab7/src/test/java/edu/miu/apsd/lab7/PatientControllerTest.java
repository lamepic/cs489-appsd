package edu.miu.apsd.lab7;

import edu.miu.apsd.lab7.controller.PatientController;
import edu.miu.apsd.lab7.model.Patient;
import edu.miu.apsd.lab7.service.PatientService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.iterableWithSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = PatientController.class)
public class PatientControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    PatientService patientService;

    @Before
    public void setUp() {
        List<Patient> patients = Arrays.asList(
                Patient.builder().id(1)
                        .email("john@example.com")
                        .firstName("John")
                        .lastName("Doe")
                        .dateOfBirth(LocalDate.of(1989, 12, 12))
                        .phoneNumber("123-456-7890")
                        .mailingAddress("123 Main St, City, Country")
                        .build(),
                Patient.builder().id(2)
                        .email("jane@example.com")
                        .firstName("Jane")
                        .lastName("Doe")
                        .dateOfBirth(LocalDate.of(1983, 10, 1))
                        .phoneNumber("987-654-3210")
                        .mailingAddress("456 Elm St, City, Country")
                        .build()
        );
        Mockito.when(patientService.getAllPatient()).thenReturn(patients);
    }

    @Test
    public void testListBooks() throws Exception {
        mockMvc.perform(get("/api/v1/patient"))
                .andExpect(status().isOk())
                .andExpect(view().name("list"))
                .andExpect(model().attributeExists("patients"))
                .andExpect(model().attribute("patients", iterableWithSize(2)));
    }
}
