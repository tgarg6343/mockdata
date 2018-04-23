package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="products")
public class MockProducts {
private String kkdFarmId;
@Id
private String productId;
private String imageUrl;
private String productName;
private String description;
private Integer price;
private Integer quantity;
private Boolean availability;

public MockProducts() {
	super();
	// TODO Auto-generated constructor stub
	}
	public MockProducts(String kkdFarmId, String productId, String imageUrl, String productName, String description,
			Integer price, Integer quantity, Boolean availability) {
		super();
		this.kkdFarmId = kkdFarmId;
		this.productId = productId;
		this.imageUrl = imageUrl;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.availability = availability;
	}
	public String getKkdFarmId() {
		return kkdFarmId;
	}
	public void setKkdFarmId(String kkdFarmId) {
		this.kkdFarmId = kkdFarmId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Boolean getAvailability() {
		return availability;
	}
	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "MockProducts [kkdFarmId=" + kkdFarmId + ", productId=" + productId + ", imageUrl=" + imageUrl
				+ ", productName=" + productName + ", description=" + description + ", price=" + price + ", quantity="
				+ quantity + ", availability=" + availability + "]";
	}
}
