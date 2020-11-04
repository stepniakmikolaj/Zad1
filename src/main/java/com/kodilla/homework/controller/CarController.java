package com.kodilla.homework.controller;

import com.kodilla.homework.domain.Car;
import com.kodilla.homework.domain.CarDto;
import com.kodilla.homework.service.CarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/cars")
class CarController {
    private final CarService service;

    @Autowired
    private ModelMapper modelMapper;

    private Car mapToEntity(final CarDto carDto) {
        return modelMapper.map(carDto, Car.class);
    }

    private CarDto mapToDto(final Car car) {
        return modelMapper.map(car, CarDto.class);
    }

    private List<CarDto> mapToDtoList(final List<Car> carList) {
        return carList.stream().map(c -> modelMapper.map(c, CarDto.class)).collect(Collectors.toList());
    }

    @GetMapping
    public List<CarDto> m1() {
        log.info("Liczba aut w bazie: " + service.getCars().size());
        return mapToDtoList(service.getCars());
    }

    @PostMapping
    public void m2(@RequestBody CarDto carDto) {
        log.info("Dodano nowe auto: " + carDto);
        service.createCar(mapToEntity(carDto));
    }

    @DeleteMapping(path = "/{index}")
    public void m3(@PathVariable("index") int index) {
        log.info("Usunieto auto o indeksie: " + index);
        service.deleteCar(index);
    }

}
