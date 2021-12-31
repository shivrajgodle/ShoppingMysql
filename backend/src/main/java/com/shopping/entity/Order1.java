package com.shopping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.annotation.Transient;

@Entity
public class Order1 {

	@Id
	@GeneratedValue
	private int id;
	private String productName;
	
	private String price;
	private String uid;
	private Long date;
	private int GrandTotal;
	
	
	@Transient
	public static final String SEQUENCE_NAME = "user_sequence";
	
	
	
	public Order1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Order1(String productName, String price, String uid, Long date, int grandTotal) {
		super();
		this.productName = productName;
		this.price = price;
		this.uid = uid;
		this.date = date;
		GrandTotal = grandTotal;
	}



	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public Long getDate() {
		return date;
	}
	public void setDate(Long date) {
		this.date = date;
	}
	public int getGrandTotal() {
		return GrandTotal;
	}
	public void setGrandTotal(int grandTotal) {
		GrandTotal = grandTotal;
	}
	
	
	
}