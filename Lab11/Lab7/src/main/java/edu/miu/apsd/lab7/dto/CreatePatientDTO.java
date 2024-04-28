package edu.miu.apsd.lab7.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record CreatePatientDTO(
        @NotEmpty
        String firstName,
         String lastName,
         String mailingAddress,
         LocalDate dateOfBirth,
         String email,
         String phoneNumber
) {
}
