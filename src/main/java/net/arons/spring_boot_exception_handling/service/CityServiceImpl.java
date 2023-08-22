package net.arons.spring_boot_exception_handling.service;

import net.arons.spring_boot_exception_handling.exception.CityNotFoundException;
import net.arons.spring_boot_exception_handling.exception.NoDataFoundException;
import net.arons.spring_boot_exception_handling.model.City;
import net.arons.spring_boot_exception_handling.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService{

    private final CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }


    @Override
    public City findById(Long id) {
        return cityRepository.findById(id)
                .orElseThrow(() -> new CityNotFoundException(id));
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public List<City> findAll() {

        var cities = (List<City>) cityRepository.findAll();

        if (cities.isEmpty()) {

            throw new NoDataFoundException();
        }
        return cities;
    }
}
