package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;

public class ProductDTO {

	private Long id;
	private String name;
	private String description;
	private double price;
	private String imgUrl;

	public ProductDTO(Long id, String name, String description, double price, String imgUrl) {

		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imgUrl = imgUrl;
	}

	public ProductDTO() {


	}
	public ProductDTO(Product product) {

	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public String getImgUrl() {
		return imgUrl;
	}	
}
