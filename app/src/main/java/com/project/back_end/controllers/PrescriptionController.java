package com.project.back_end.controllers;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    @PostMapping
    public ResponseEntity<?> savePrescription(
            @RequestParam String token,
            @Valid @RequestBody Map<String, Object> requestBody) {

        if (token == null || token.isBlank()) {
            return ResponseEntity.badRequest().body(Map.of("success", false, "message", "Invalid token"));
        }

        return ResponseEntity.ok(Map.of("success", true, "message", "Prescription saved successfully"));
    }
}
