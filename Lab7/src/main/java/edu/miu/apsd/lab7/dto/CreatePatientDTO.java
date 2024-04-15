package edu.miu.apsd.lab7.dto;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record CreatePatientDTO(
        String firstName,
         String lastName,
         String mailingAddress,
         LocalDate dateOfBirth,
         String email,
         String phoneNumber
) {
}
