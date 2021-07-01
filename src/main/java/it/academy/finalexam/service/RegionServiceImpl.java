package it.academy.finalexam.service;

import it.academy.finalexam.entity.Region;
import it.academy.finalexam.repository.RegionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegionServiceImpl implements RegionService {
    @Autowired
    private RegionRepo regionRepo;

    @Override
    public List<Region> getAll() {
        return regionRepo.findAll();
    }

    @Override
    public Region getRegionById(Long id) {
        return regionRepo.findById(id).orElse(null);
    }

    @Override
    public Region save(Region region) {
        return regionRepo.save(region);
    }
}
