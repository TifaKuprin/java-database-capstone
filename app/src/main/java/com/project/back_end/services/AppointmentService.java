package com.project.back_end.services;

import com.project.back_end.models.Appointment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentService {

    public Appointment bookAppointment(Appointment appointment) {
        return appointment;
    }

    public List<Appointment> getAppointmentsForDoctorByDate(Long doctorId, String date) {
        return new ArrayList<>();
    }
}
