package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class MockOrder {

	private String kkdFarmId;
	private String productId;
	private String kkdCustId;
	private String name;
	private String address;
	@Id
	private String orderId;
	private String farmerStatus;
	private String expectedTime;
	private String expectedDate;
	private String mobileNo;
	private String transactionId;
	private Float totalAmount;
	private String orderType;
	private String orderStatus;
	private String otp;
	private String otpVerified;

	private String productName;
	private Integer price;
	private Float avgRating;
	private Integer quantity;

	public MockOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MockOrder(String kkdFarmId, String productId, String kkdCustId, String name, String address, String orderId,
			String farmerStatus, String expectedTime, String expectedDate, String mobileNo, String transactionId,
			Float totalAmount, String orderType, String orderStatus, String otp, String otpVerified,
			String productName, Integer price, Float avgRating, Integer quantity) {
		super();
		this.kkdFarmId = kkdFarmId;
		this.productId = productId;
		this.kkdCustId = kkdCustId;
		this.name = name;
		this.address = address;
		this.orderId = orderId;
		this.farmerStatus = farmerStatus;
		this.expectedTime = expectedTime;
		this.expectedDate = expectedDate;
		this.mobileNo = mobileNo;
		this.transactionId = transactionId;
		this.totalAmount = totalAmount;
		this.orderType = orderType;
		this.orderStatus = orderStatus;
		this.otp = otp;
		this.otpVerified = otpVerified;
		this.productName = productName;
		this.price = price;
		this.avgRating = avgRating;
		this.quantity = quantity;
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

	public String getKkdCustId() {
		return kkdCustId;
	}

	public void setKkdCustId(String kkdCustId) {
		this.kkdCustId = kkdCustId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getFarmerStatus() {
		return farmerStatus;
	}

	public void setFarmerStatus(String farmerStatus) {
		this.farmerStatus = farmerStatus;
	}

	public String getExpectedTime() {
		return expectedTime;
	}

	public void setExpectedTime(String expectedTime) {
		this.expectedTime = expectedTime;
	}

	public String getExpectedDate() {
		return expectedDate;
	}

	public void setExpectedDate(String expectedDate) {
		this.expectedDate = expectedDate;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public String getOtpVerified() {
		return otpVerified;
	}

	public void setOtpVerified(String otpVerified) {
		this.otpVerified = otpVerified;
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
		return "MockOrder [kkdFarmId=" + kkdFarmId + ", productId=" + productId + ", kkdCustId=" + kkdCustId + ", name="
				+ name + ", address=" + address + ", orderId=" + orderId + ", farmerStatus=" + farmerStatus
				+ ", expectedTime=" + expectedTime + ", expectedDate=" + expectedDate + ", mobileNo=" + mobileNo
				+ ", transactionId=" + transactionId + ", totalAmount=" + totalAmount + ", orderType=" + orderType
				+ ", orderStatus=" + orderStatus + ", otp=" + otp + ", otpVerified=" + otpVerified + ", productName="
				+ productName + ", price=" + price + ", avgRating=" + avgRating + ", quantity=" + quantity + "]";
	}

}
