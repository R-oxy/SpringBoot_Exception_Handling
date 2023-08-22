package net.arons.spring_boot_exception_handling.service;

import net.arons.spring_boot_exception_handling.model.City;

import java.util.List;

public interface CityService {
    City findById(Long id);
    City save(City city);
    List<City> findAll();
}
