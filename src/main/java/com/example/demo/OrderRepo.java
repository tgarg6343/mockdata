package com.example.demo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepo extends MongoRepository<MockOrder, String>{

	List<MockCart> findAllByKkdCustId(String id);

	
}
