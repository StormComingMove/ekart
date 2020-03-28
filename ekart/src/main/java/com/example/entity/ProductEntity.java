package com.example.entity;

public class ProductEntity {
	private String productId;
	private String name;
	private String description;
	private String category;
	private String brand;
	private double price;
	private double discount;
	private int quantity;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public ProductEntity(String productId, String name, String description, String category, String brand, double price,
			double discount, int quantity) {
		super();
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.category = category;
		this.brand = brand;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
	}
	

}
