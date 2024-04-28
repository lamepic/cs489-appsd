package edu.miu.apsd.lab7.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "surgeries")
@Entity
public class Surgery {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String address;
    private String telephone;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Appointment> appointments;
}
