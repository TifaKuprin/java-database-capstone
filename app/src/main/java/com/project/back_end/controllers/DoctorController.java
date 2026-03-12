package com.project.back_end.controllers;

import com.project.back_end.services.DoctorService;
import com.project.back_end.services.TokenService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    private final DoctorService doctorService;
    private final TokenService tokenService;

    public DoctorController(DoctorService doctorService, TokenService tokenService) {
        this.doctorService = doctorService;
        this.tokenService = tokenService;
    }

    @GetMapping("/availability")
    public ResponseEntity<?> getDoctorAvailability(
            @RequestParam String token,
            @RequestParam Long doctorId,
            @RequestParam String date) {

        if (token == null || token.isBlank()) {
            return ResponseEntity.badRequest().body(Map.of("success", false, "message", "Invalid token"));
        }

        return ResponseEntity.ok(Map.of(
                "success", true,
                "doctorId", doctorId,
                "date", date,
                "availableTimes", doctorService.getAvailableTimeSlots(doctorId, date)
        ));
    }
}
