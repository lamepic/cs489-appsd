package edu.miu.apsd.lab6.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

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
