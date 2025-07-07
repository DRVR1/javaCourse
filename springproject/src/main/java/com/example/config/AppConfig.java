package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.Laptop;
import com.example.Computer;
import com.example.Alien;

@Configuration
public class AppConfig {
    @Bean
    @Primary
    public Laptop laptop() {
        return new Laptop();
    }

    @Bean
    public Alien alien(Computer laptop) {
        Alien alien = new Alien();
        alien.setLap1(laptop);
        return alien;
    }
}
