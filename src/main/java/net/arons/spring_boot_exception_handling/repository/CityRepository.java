package net.arons.spring_boot_exception_handling.repository;

import net.arons.spring_boot_exception_handling.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
}
