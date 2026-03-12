package com.project.back_end.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class DoctorService {

    public List<String> getAvailableTimeSlots(Long doctorId, String date) {
        return Arrays.asList("09:00", "10:00", "11:00");
    }

    public ResponseEntity<?> validateDoctorLogin(String email, String password) {
        if ("doctor@clinic.com".equals(email) && "password".equals(password)) {
            return ResponseEntity.ok(Map.of("success", true, "message", "Login successful"));
        }
        return ResponseEntity.badRequest().body(Map.of("success", false, "message", "Invalid credentials"));
    }
}
