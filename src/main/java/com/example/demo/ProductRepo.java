package com.example.demo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<MockProducts,String>{

	List<MockProducts> findAllByKkdFarmId(String id);

}
