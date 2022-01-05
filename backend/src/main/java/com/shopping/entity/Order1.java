package com.shopping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



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
	
	
	public Order1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Order1(int id, String productName, String price, String uid, Long date, int grandTotal) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.uid = uid;
		this.date = date;
		GrandTotal = grandTotal;
	}
	
	
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