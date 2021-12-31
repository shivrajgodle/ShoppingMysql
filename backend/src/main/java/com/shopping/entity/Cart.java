package com.shopping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Cart {

	@Id
	@GeneratedValue
	private int id;
	private String productName;
	private String description;
	private long price;
	private String uid;
	private int quantity;
	private String image;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
	public Cart(int id, String productName, String description, long price, String uid, int quantity, String image) {
		super();
		this.id = id;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.uid = uid;
		this.quantity = quantity;
		this.image = image;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
		

	
	
}
