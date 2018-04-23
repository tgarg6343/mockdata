package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MockController {

	
	@Autowired
	CartRepo cartRepo;
	
	@Autowired
	OrderRepo orderRepo;
	
	@Autowired
	ProductRepo productRepo;
	
	@PostMapping("/add/cart")
	public ResponseEntity<HttpStatus> addItem(@RequestBody MockCart cartItem){
		
		cartRepo.save(cartItem);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("/all/{id}")
	public List<MockCart> getItems(@PathVariable String id){
		return cartRepo.findAllByKkdCustId(id);
	}
	
	@GetMapping("/all")
	public List<MockCart> getItems(){
		return cartRepo.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteItem(@PathVariable String id) {
		cartRepo.deleteById(id);
	}
	
	@PutMapping("/update/cart")
	public ResponseEntity<HttpStatus> update(@RequestBody MockCart cartItem) {
		cartRepo.save(cartItem);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
	
	// ordeeeeeeeeeeeeerrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr
	
	@PostMapping("/order/add/order")
	public String addOrder(@RequestBody MockOrder order){
		
		System.out.println(order);
		orderRepo.save(order);
		return "created";
	}
	
	@GetMapping("/order/all/{id}")
	public List<MockCart> getAllOrders(@PathVariable String id){
		return orderRepo.findAllByKkdCustId(id);
	}
	
	@GetMapping("/order/all")
	public List<MockOrder> getOrders(){
		return orderRepo.findAll();
	}
	
	@DeleteMapping("/order/delete/{id}")
	public void deleteOrder(@PathVariable String id) {
		orderRepo.deleteById(id);
	}
	
	
	@DeleteMapping("/order/delete")
	public void deleteOrder() {
		orderRepo.deleteAll();
	}
	
	
	/////proddddduuuuuuuuuucccccccccccccccccccccttttttttttttttttttttt
	
	
	@PostMapping("/add/product")
	public String addOrder(@RequestBody MockProducts product){
		
		System.out.println(product);
		productRepo.save(product);
		return "created";
	}
	
	@GetMapping("/product/all/{id}")
	public List<MockProducts> getAllProducts(@PathVariable String id){
		return productRepo.findAllByKkdFarmId(id);
	}
	
	@GetMapping("/product/all")
	public List<MockProducts> getProducts(){
		return productRepo.findAll();
	}
	
	@DeleteMapping("/product/delete/{id}")
	public void deleteProduct(@PathVariable String id) {
		productRepo.deleteById(id);
	}
	
	
	@DeleteMapping("/product/delete")
	public void deleteProducts() {
		productRepo.deleteAll();
	}
	
	
}
