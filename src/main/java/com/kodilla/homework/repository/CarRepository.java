package com.kodilla.homework.repository;

import com.kodilla.homework.domain.Car;

import java.util.List;

public interface CarRepository {

    List<Car> findAll();
    void save(Car Car);
    void deleteByIndex(int index);

}
