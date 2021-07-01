package it.academy.finalexam.service;

import it.academy.finalexam.entity.Log;
import it.academy.finalexam.model.DateModel;
import it.academy.finalexam.model.LogModel;
import it.academy.finalexam.model.PercentModel;

import java.util.List;

public interface LogService {
    List<Log> getAll();
    Log getLogById(Long id);
    Log save(Log log);
    Log save(LogModel logModel);
    List<Log> getInfectedByDate(DateModel dateModel);
    List<Log> getVaccinatedByDate(DateModel dateModel);
    List<Log> findAllByCitizen_Region_Id(Long regionId);
    PercentModel getPercent(Long regionId);
}
