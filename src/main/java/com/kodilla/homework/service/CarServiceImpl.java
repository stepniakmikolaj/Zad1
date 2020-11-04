package com.kodilla.homework.service;

import com.kodilla.homework.domain.Car;
import com.kodilla.homework.repository.CarRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
class CarServiceImpl implements CarService {

    private final CarRepository repository;

    @Override
    public List<Car> getCars() {
        return repository.findAll();
    }

    @Override
    public void createCar(Car car) {
        repository.save(car);
    }

    @Override
    public void deleteCar(int index) {
        repository.deleteByIndex(index);
    }

}
