package it.academy.finalexam.cotroller;

import it.academy.finalexam.entity.Vaccine;
import it.academy.finalexam.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vaccine")
public class VaccineController {
    @Autowired
    private VaccineService vaccineService;

    @GetMapping
    public List<Vaccine> getAll(){
        return vaccineService.getAll();
    }
    @GetMapping("/{id}")
    public Vaccine getVaccineById(@PathVariable Long id){
        return vaccineService.getVaccineById(id);
    }
    @PostMapping
    public Vaccine save (@RequestBody Vaccine vaccine){
        return vaccineService.save(vaccine);
    }
}
