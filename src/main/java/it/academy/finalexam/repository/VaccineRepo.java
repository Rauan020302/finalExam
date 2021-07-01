package it.academy.finalexam.repository;

import it.academy.finalexam.entity.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRepo extends JpaRepository<Vaccine,Long> {
}
