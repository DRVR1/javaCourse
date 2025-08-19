package com.example.microservice1.feing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// El nombre de los microservicios se pueden obtener en la interfaz web de eurekaServer
@FeignClient("MICROSERVICE2")
public interface FeingInterface {

    @GetMapping("/micro2")
    public String micro2(); // Mapeo perteneciente al controlador del microservicio 2
}
