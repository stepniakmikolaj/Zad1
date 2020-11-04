package com.kodilla.homework.domain;

import com.kodilla.homework.enums.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarDto {
    String company;
    String model;
    String color;
    boolean manual;
    Version version;
    int year;
}