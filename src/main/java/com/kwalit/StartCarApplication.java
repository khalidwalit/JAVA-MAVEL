package com.kwalit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.math.BigDecimal;

@SpringBootApplication
public class StartCarApplication {

    // start everything
    public static void main(String[] args) {
        SpringApplication.run(StartCarApplication.class, args);
    }

    // run this only on profile 'demo', avoid run this in test
    @Profile("demo")
    @Bean
    CommandLineRunner initDatabase(CarRepository repository) {
        return args -> {
            repository.save(new Car(2019, "Proton", 130));
        };
    }
}