package it.academy.finalexam.cotroller;

import it.academy.finalexam.entity.Citizen;
import it.academy.finalexam.model.CitizenModel;
import it.academy.finalexam.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/citizen")
public class CitizenController {
    @Autowired
    private CitizenService citizenService;

    @GetMapping
    public List<Citizen> getAll (){
        return citizenService.getAll();
    }
    @GetMapping("/{id}")
    public Citizen getCitizenById(@PathVariable Long id){
        return citizenService.getCitizenById(id);
    }
    @PostMapping
    public Citizen save (@RequestBody CitizenModel citizenModel){
        return citizenService.save(citizenModel);
    }
 }
