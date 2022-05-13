package com.cropdeal.FarmerService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cropdeal.FarmerService.models.Farmers;


public interface FarmerRepository extends MongoRepository<Farmers, String> {

}