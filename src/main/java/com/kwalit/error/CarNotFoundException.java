package com.kwalit.error;

public class CarNotFoundException extends RuntimeException {

    public CarNotFoundException(Long id) {
        super("Car id not found : " + id);
    }

}
