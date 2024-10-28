package com.dh.DentalClinicMVC.controller;

import com.dh.DentalClinicMVC.model.Patient;
import com.dh.DentalClinicMVC.service.PatientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    // UN ENDPOINT QUE NOS PERMITA AGREGAR UN PACIENTE
    @PostMapping
    public Patient save (@RequestBody Patient patient) {
        return patientService.save(patient);
    }

    // UN ENDPOINT QUE NOS PERMITA ACTUALIZAR UN PACIENTE QUE YA ESTE REGISTRADO
    @PutMapping
    public void update(@RequestBody Patient patient) {
        patientService.update(patient);
    }

}