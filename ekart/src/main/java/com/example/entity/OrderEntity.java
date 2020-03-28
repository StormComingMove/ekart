package com.example.entity;

import java.time.LocalDateTime;
import java.util.List;

public class OrderEntity {
	private String orderId;
	private String orderNo;
	private LocalDateTime date;
	private List<ProductEntity> products;
	private double totalAmt;
	private String AddressId;
	private String status;
	private String payment;
	private LocalDateTime dateOfDelivery;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public List<ProductEntity> getProducts() {
		return products;
	}
	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}
	public double getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}
	public String getAddressId() {
		return AddressId;
	}
	public void setAddressId(String addressId) {
		AddressId = addressId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public LocalDateTime getDateOfDelivery() {
		return dateOfDelivery;
	}
	public void setDateOfDelivery(LocalDateTime dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}
	public OrderEntity(String orderId, String orderNo, LocalDateTime date, List<ProductEntity> products,
			double totalAmt, String addressId, String status, String payment, LocalDateTime dateOfDelivery) {
		super();
		this.orderId = orderId;
		this.orderNo = orderNo;
		this.date = date;
		this.products = products;
		this.totalAmt = totalAmt;
		AddressId = addressId;
		this.status = status;
		this.payment = payment;
		this.dateOfDelivery = dateOfDelivery;
	}
	
	
	
}
