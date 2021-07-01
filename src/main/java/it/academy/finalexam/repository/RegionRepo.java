package it.academy.finalexam.repository;

import it.academy.finalexam.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepo extends JpaRepository<Region,Long> {
}
