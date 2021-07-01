package it.academy.finalexam.cotroller;

import it.academy.finalexam.entity.Region;
import it.academy.finalexam.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/region")
public class RegionController {
    @Autowired
    private RegionService regionService;

    @GetMapping
    public List<Region> getAll(){
        return regionService.getAll();
    }

    @GetMapping("/{id}")
    public Region getRegionById(@PathVariable Long id){
        return regionService.getRegionById(id);
    }

    @PostMapping
    public Region save (@RequestBody Region region){
        return regionService.save(region);
    }

}
