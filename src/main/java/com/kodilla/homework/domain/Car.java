package com.kodilla.homework.domain;

import com.kodilla.homework.enums.Version;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Car {
    String company;
    String model;
    String color;
    boolean manual;
    Version version;
    int year;
}