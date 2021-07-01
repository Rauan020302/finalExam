package it.academy.finalexam.service;

import it.academy.finalexam.entity.Vaccine;

import java.util.List;

public interface VaccineService {
    List<Vaccine> getAll();
    Vaccine getVaccineById(Long id);
    Vaccine save(Vaccine vaccine);
}
