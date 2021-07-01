package it.academy.finalexam.repository;

import it.academy.finalexam.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepo extends JpaRepository<Log,Long> {
    List<Log> findAllByCitizen_Region_Id(Long region_id);
}
