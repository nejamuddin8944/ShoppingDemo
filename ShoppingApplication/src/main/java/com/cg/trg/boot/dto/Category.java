package com.cg.trg.boot.dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table
public class Category {
	@Id
	private String catId;
	private  String catagoryName;
	public Category() {
		super();
	}
	public Category(String catId, String catagoryName) {
		super();
		this.catId = catId;
		this.catagoryName = catagoryName;
	}
	public String getCatId() {
		return catId;
	}
	public void setCatId(String catId) {
		this.catId = catId;
	}
	public String getCatagoryName() {
		return catagoryName;
	}
	public void setCatagoryName(String catagoryName) {
		this.catagoryName = catagoryName;
	}
	@Override
	public String toString() {
		return "Catagory [catId=" + catId + ", catagoryName=" + catagoryName + "]";
	}
	
	

}
