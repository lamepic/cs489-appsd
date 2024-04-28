package edu.miu.apsd.lab7.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "appointments")
@Entity
public class Appointment {
    @Id
    @GeneratedValue
    private Integer id;
    private LocalDate data;
    private LocalTime time;
    private String location;
    @ManyToOne(cascade = CascadeType.ALL)
    private Dentist dentist;
    @ManyToOne(cascade = CascadeType.ALL)
    private Patient patient;
    @ManyToOne(cascade = CascadeType.ALL)
    private Surgery surgery;
}
