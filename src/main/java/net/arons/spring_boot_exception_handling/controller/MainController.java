package net.arons.spring_boot_exception_handling.controller;

import jakarta.validation.Valid;
import net.arons.spring_boot_exception_handling.model.City;
import net.arons.spring_boot_exception_handling.service.CityService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    private final CityService cityService;

    public MainController(CityService cityService) {
        this.cityService = cityService;
    }

    @PostMapping(value = "/cities", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public City createCity(@RequestBody @Valid City city){
        return cityService.save(city);
    }

    @GetMapping("/cities")
    public List<City> findAll(){
        return cityService.findAll();
    }

    @GetMapping("/cities/{id}")
    public City getCity(@PathVariable Long id){
        return cityService.findById(id);
    }
}
