package it.academy.finalexam.service;

import it.academy.finalexam.entity.Citizen;
import it.academy.finalexam.entity.Log;
import it.academy.finalexam.entity.Vaccine;
import it.academy.finalexam.model.DateModel;
import it.academy.finalexam.model.LogModel;
import it.academy.finalexam.model.PercentModel;
import it.academy.finalexam.repository.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogRepo logRepo;
    @Autowired
    private CitizenService citizenService;
    @Autowired
    private VaccineService vaccineService;

    @Override
    public List<Log> getAll() {
        return logRepo.findAll();
    }

    @Override
    public Log getLogById(Long id) {
        return logRepo.findById(id).orElse(null);
    }

    @Override
    public Log save(Log log) {
        return logRepo.save(log);
    }

    @Override
    public Log save(LogModel logModel) {
        Citizen citizen = citizenService.getCitizenById(logModel.getCitizenId());
        Vaccine vaccine = vaccineService.getVaccineById(logModel.getVaccineId());
        Log log = Log.builder()
                .vaccine(vaccine)
                .citizen(citizen)
                .isInfected(logModel.getIsInfected())
                .date(logModel.getDate()).build();
        return logRepo.save(log);
    }

    @Override
    public List<Log> getInfectedByDate(DateModel dateModel) {
        List<Log> logs = getAll();
        List<Log> list = new ArrayList<>();
        for (Log log :logs) {
            if (log.getDate().getMonthValue() == dateModel.getDate().getMonthValue()){
                if (!log.getIsInfected()){
                    list.add(log);
                }
            }
        }
        return list;
    }

    @Override
    public List<Log> getVaccinatedByDate(DateModel dateModel) {
        List<Log> logs = getAll();
        List<Log> list = new ArrayList<>();
        for (Log log :logs) {
            if (log.getDate().getMonthValue() == dateModel.getDate().getMonthValue()){
                if (log.getIsInfected()){
                    list.add(log);
                }
            }
        }
        return list;
    }

    @Override
    public List<Log> findAllByCitizen_Region_Id(Long region_id) {
        return logRepo.findAllByCitizen_Region_Id(region_id);
    }

    @Override
    public PercentModel getPercent(Long regionId) {
        List<Log> logs = logRepo.findAllByCitizen_Region_Id(regionId);
        PercentModel percentModel = new PercentModel();
        Integer countInfected = 0;
        Integer countVaccinated = 0;
        for (Log log: logs){
             percentModel.setRegionName(log.getCitizen().getRegion().getName());
             percentModel.setPopulation(log.getCitizen().getRegion().getPopulation());
            if (log.getIsInfected()){
                countInfected++;
            }else{
                countVaccinated++;
            }

            percentModel.setInfected(countInfected);
            percentModel.setVaccinated(countVaccinated);

            percentModel.setPercentInfected((double) (percentModel.getInfected()/percentModel.getPopulation()*100));
            percentModel.setPercentVaccinated((double) (percentModel.getVaccinated()/percentModel.getPopulation()*100));
        }

        return percentModel;
    }
}
