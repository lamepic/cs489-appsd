package edu.miu.apsd.lab7.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "dentists")
@Entity
public class Dentist {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String specialization;
    @OneToMany(mappedBy = "dentist")
    private List<Appointment> appointments;
}
