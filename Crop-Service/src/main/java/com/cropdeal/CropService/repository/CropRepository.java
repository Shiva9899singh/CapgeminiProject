package com.cropdeal.CropService.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cropdeal.CropService.model.Crop;


@Repository("cropRepo") 
public interface CropRepository extends MongoRepository<Crop, String> {
       
}