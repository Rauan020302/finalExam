package it.academy.finalexam.service;

import it.academy.finalexam.entity.Vaccine;
import it.academy.finalexam.repository.VaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VaccineServiceImpl implements VaccineService {
    @Autowired
    private VaccineRepo vaccineRepo;

    @Override
    public List<Vaccine> getAll() {
        return vaccineRepo.findAll();
    }

    @Override
    public Vaccine getVaccineById(Long id) {
        return vaccineRepo.findById(id).orElse(null);
    }

    @Override
    public Vaccine save(Vaccine vaccine) {
        return vaccineRepo.save(vaccine);
    }
}
