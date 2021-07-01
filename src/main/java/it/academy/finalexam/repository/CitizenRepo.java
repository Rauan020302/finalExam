package it.academy.finalexam.repository;

import it.academy.finalexam.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenRepo extends JpaRepository<Citizen,Long> {
}
