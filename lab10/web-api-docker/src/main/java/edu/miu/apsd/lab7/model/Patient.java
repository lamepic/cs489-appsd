package edu.miu.apsd.lab7.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "patients")
@Entity
public class Patient {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private String mailingAddress;
    private LocalDate dateOfBirth;
    private String email;
    private String phoneNumber;
    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;
}
