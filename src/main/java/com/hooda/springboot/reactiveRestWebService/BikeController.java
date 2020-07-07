package com.hooda.springboot.reactiveRestWebService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller

@RequestMapping(path = "/bikes")
public class BikeController {
    private final BikeRepository bikeRepository;

    public BikeController(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @PostMapping()
    public @ResponseBody
    Mono<Bike> addBike(@RequestBody Bike bike) {
        return bikeRepository.save(bike);
    }

    @GetMapping()
    public @ResponseBody
    Flux<Bike> getAllBike() {
        Flux<Bike> result = bikeRepository.findAll();
        return result;
    }
}