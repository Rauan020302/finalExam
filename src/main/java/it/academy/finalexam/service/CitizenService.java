package it.academy.finalexam.service;

import it.academy.finalexam.entity.Citizen;
import it.academy.finalexam.model.CitizenModel;

import java.util.List;

public interface CitizenService {
    List<Citizen> getAll();
    Citizen getCitizenById(Long id);
    Citizen save(CitizenModel citizenModel);


}
