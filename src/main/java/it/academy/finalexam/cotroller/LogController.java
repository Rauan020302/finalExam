package it.academy.finalexam.cotroller;

import it.academy.finalexam.entity.Log;
import it.academy.finalexam.model.DateModel;
import it.academy.finalexam.model.LogModel;
import it.academy.finalexam.model.PercentModel;
import it.academy.finalexam.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class LogController {
    @Autowired
    private LogService logService;

    @GetMapping
    public List<Log> getAll(){
        return logService.getAll();
    }

    @GetMapping("/{id}")
    public Log getLogById(@PathVariable Long id){
        return logService.getLogById(id);
    }

    @PostMapping
    public Log saveLog(@RequestBody LogModel logModel){
        return logService.save(logModel);
    }

    @PostMapping("/infected")
    public List<Log> getInfectedByDate(@RequestBody DateModel dateModel){
         return logService.getInfectedByDate(dateModel);
    }

    @PostMapping("/vaccinated")
    public List<Log> getVaccinatedByDate(@RequestBody DateModel dateModel){
        return logService.getVaccinatedByDate(dateModel);
    }

    @GetMapping("/region/{id}")
    public List<Log> getRegionById(@PathVariable Long id){
        return logService.findAllByCitizen_Region_Id(id);
    }
    @GetMapping("/percent/{id}")
    public PercentModel getPercent(@PathVariable Long id){
        return logService.getPercent(id);
    }
}
