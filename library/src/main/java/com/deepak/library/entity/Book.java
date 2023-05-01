package com.deepak.library.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "books")
public class Book implements Serializable {

	@GenericGenerator(name = "unq", strategy = "increment")
	@GeneratedValue(generator = "unq")
	@Id
	@Column(name = "alt_key")
	private long altkey;
	@Column(name = "name")
	private String name;
	@Column(name = "author")
	private String author;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "price")
	private double price;

	public long getAltkey() {
		return altkey;
	}

	public void setAltkey(long altkey) {
		this.altkey = altkey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
