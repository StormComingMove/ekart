package com.example.ekart.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS")
public class OrderEntity {
	@Id
	@Column(name="ORDER_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer orderId;
	
	@Column(name="ORDER_NO")
	private Integer orderNo;
	
	@Column(name="DATE")
	private LocalDateTime date;
	
	//@Column(name="PRODUCTS")
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="PRODUCT_ID")
	private ProductEntity products;
	
	@Column(name="TOTAL_AMT")
	private double totalAmt;
	
	@Column(name="ADDRESS_ID	")
	private String AddressId;
	
	@Column(name="STATUS")
	@Enumerated(EnumType.STRING)
	private StatusEntity status;
	
	@Column(name="PAYMENT")
	@Enumerated(EnumType.STRING)
	private PaymentEntity payment;
	
	@Column(name="DATE_OF_DELIVERY")
	private LocalDateTime dateOfDelivery;
	
	
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	public ProductEntity getProducts() {
		return products;
	}
	public void setProducts(ProductEntity products) {
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
	
	
	public PaymentEntity getPayment() {
		return payment;
	}
	public void setPayment(PaymentEntity payment) {
		this.payment = payment;
	}
	public LocalDateTime getDateOfDelivery() {
		return dateOfDelivery;
	}
	public void setDateOfDelivery(LocalDateTime dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	public StatusEntity getStatus() {
		return status;
	}
	public void setStatus(StatusEntity status) {
		this.status = status;
	}

	
	
}
