package com.kodilla.homework.repository;

import com.kodilla.homework.domain.Car;

import java.util.ArrayList;
import java.util.List;

class InMemoryCarRepository implements CarRepository {

    private List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public void save(Car car) {
        cars.add(car);
    }

    @Override
    public void deleteByIndex(int index) {
        cars.remove(index);
    }

}