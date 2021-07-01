package it.academy.finalexam.service;

import it.academy.finalexam.entity.Citizen;
import it.academy.finalexam.entity.Region;
import it.academy.finalexam.model.CitizenModel;
import it.academy.finalexam.repository.CitizenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CitizenServiceImpl implements CitizenService {
    @Autowired
    private CitizenRepo citizenRepo;
    @Autowired
    private RegionService regionService;
    @Override
    public List<Citizen> getAll() {
        return citizenRepo.findAll();
    }

    @Override
    public Citizen getCitizenById(Long id) {
        return citizenRepo.findById(id).orElse(null);
    }

    @Override
    public Citizen save(CitizenModel citizenModel) {
        Region region = regionService.getRegionById(citizenModel.getRegionId());
        Citizen citizen = Citizen.builder()
                .name(citizenModel.getName())
                .region(region).build();

        return citizenRepo.save(citizen);
    }


}
