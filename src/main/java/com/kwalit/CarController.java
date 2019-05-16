package com.kwalit;

import com.kwalit.error.CarNotFoundException;
import com.kwalit.error.CarUnSupportedFieldPatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CarController {

    @Autowired
    private CarRepository repository;

    // Get Car and Return Car Object Json
    @GetMapping("/hello")
    List<Car> findAll() {
        return repository.findAll();
    }

}
