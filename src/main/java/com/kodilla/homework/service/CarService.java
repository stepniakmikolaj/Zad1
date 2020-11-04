package com.kodilla.homework.service;

import com.kodilla.homework.domain.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars();
    void createCar(Car car);
    void deleteCar(int index);
}
