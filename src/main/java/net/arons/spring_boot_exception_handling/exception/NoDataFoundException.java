package net.arons.spring_boot_exception_handling.exception;

public class NoDataFoundException extends RuntimeException{

    public NoDataFoundException(){
        super("No data found");
    }
}
