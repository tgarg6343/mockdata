package com.example.demo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepo extends MongoRepository<MockCart, String>{

	List<MockCart> findAllByKkdCustId(String id);

}
