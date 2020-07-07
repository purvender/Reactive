package com.hooda.springboot.reactiveRestWebService;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BikeRepository extends ReactiveMongoRepository<Bike, Long> {
}
