package com.example.ekart.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SELLER")
public class SellerEntity {
	
	@Id
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="PHONE_NO")
	private String phoneNo;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="SELLER_EMAIL_ID")
	private List<ProductEntity> products;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public List<ProductEntity> getProducts() {
		return products;
	}
	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}
	public SellerEntity(String emailId, String name, String password, String phoneNo, List<ProductEntity> products) {
		super();
		this.emailId = emailId;
		this.name = name;
		this.password = password;
		this.phoneNo = phoneNo;
		this.products = products;
	}
	
	

}
