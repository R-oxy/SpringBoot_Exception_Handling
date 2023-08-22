package net.arons.spring_boot_exception_handling.exception;

public class CityNotFoundException extends RuntimeException{

    public CityNotFoundException(Long id){
        super(String.format("City with Id %d not found", id));
    }
}
