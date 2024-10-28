package com.marek_kawalski.clinic_system.user.doctor.dto;

import lombok.Builder;

@Builder
public record CreateDoctorDTO(
    String email,
    String password,
    String firstName,    // cambiado de 'name'
    String lastName,     // cambiado de 'surname'
    String phoneNumber,
    String specialization,
    String education,    // si necesitas mantener 'education' en lugar de 'license'
    String description
) {}
