package edu.miu.apsd.lab6.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

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
