package com.htc.sample.product.dto;

import java.io.Serializable;

public class ProductDto implements Serializable{

	public ProductDto(String productName, String productType) {
		super();
		this.productName = productName;
		this.productType = productType;
	}
	public ProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String productName;
	private String productType;

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	@Override
	public String toString() {
		return "ProductDto"  + ", productName=" + productName + ", productType=" + productType
				+ "]";
	}
	
}
