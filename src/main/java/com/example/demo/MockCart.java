package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="cart")
public class MockCart {
	
	@Id
	private String cartId;
	private String kkdCustId;
	private String kkdFarmId;
	private String name;
	private String productId;
	private String productName;
	private Integer price;
	private Float avgRating;
	private Integer quantity;
	
	
	
	public MockCart() {
		super();
		// TODO Auto-generated constructor stub
	}



	public MockCart(String cartId, String kkdCustId, String kkdFarmId, String name, String productId,
			String productName, Integer price, Float avgRating, Integer quantity) {
		super();
		this.cartId = cartId;
		this.kkdCustId = kkdCustId;
		this.kkdFarmId = kkdFarmId;
		this.name = name;
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.avgRating = avgRating;
		this.quantity = quantity;
	}



	public String getCartId() {
		return cartId;
	}



	public void setCartId(String cartId) {
		this.cartId = cartId;
	}



	public String getKkdCustId() {
		return kkdCustId;
	}



	public void setKkdCustId(String kkdCustId) {
		this.kkdCustId = kkdCustId;
	}



	public String getKkdFarmId() {
		return kkdFarmId;
	}



	public void setKkdFarmId(String kkdFarmId) {
		this.kkdFarmId = kkdFarmId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getProductId() {
		return productId;
	}



	public void setProductId(String productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public Integer getPrice() {
		return price;
	}



	public void setPrice(Integer price) {
		this.price = price;
	}



	public Float getAvgRating() {
		return avgRating;
	}



	public void setAvgRating(Float avgRating) {
		this.avgRating = avgRating;
	}



	public Integer getQuantity() {
		return quantity;
	}



	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "MockCart [cartId=" + cartId + ", kkdCustId=" + kkdCustId + ", kkdFarmId=" + kkdFarmId + ", farmerName="
				+ name + ", productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", avgRating=" + avgRating + ", quantity=" + quantity + "]";
	}
	
	
	
	
}
