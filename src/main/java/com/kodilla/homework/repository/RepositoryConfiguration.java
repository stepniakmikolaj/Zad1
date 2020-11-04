package com.kodilla.homework.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class RepositoryConfiguration {

    @Bean
    CarRepository repository() {
        return new InMemoryCarRepository();
    }

}