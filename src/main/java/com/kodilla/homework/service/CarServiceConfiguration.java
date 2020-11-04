package com.kodilla.homework.service;

import com.kodilla.homework.repository.CarRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class CarServiceConfiguration {

    @Bean
    CarService carService(CarRepository repository) {
        return new CarServiceImpl(repository);
    }

}