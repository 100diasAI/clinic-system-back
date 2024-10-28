package com.marek_kawalski.clinic_system.user.doctor.dto;

import lombok.Builder;

@Builder
public record UpdateDoctorDTO(
    String email,
    String firstName,
    String lastName,
    String phoneNumber,
    String specialization,
    String education,
    String description
) {}
