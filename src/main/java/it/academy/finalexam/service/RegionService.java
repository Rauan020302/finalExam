package it.academy.finalexam.service;

import it.academy.finalexam.entity.Region;

import java.util.List;

public interface RegionService {
    List<Region> getAll();
    Region getRegionById(Long id);
    Region save(Region region);
}
