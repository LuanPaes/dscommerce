package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductDTO {

	private Long id;
	
	@Size(min = 3, max = 80, message = "Nome precisa ter de 3 a 80 caracteres")
	@NotBlank(message = "Campo Requerido")
	private String name;
	
	@Size(min = 10, message = "Descrição precisa ter no minimo 10 caracteres")
	@NotBlank(message = "Campo Requerido")
	private String description;
	
	@Positive(message = "O preço deve ser positivo")
	private double price;
	private String imgUrl;

	public ProductDTO(Long id, String name, String description, double price, String imgUrl) {

		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imgUrl = imgUrl;
	}
	
	public ProductDTO(Product product) {
	       this.id = product.getId();
	        this.name = product.getName();
	        this.description = product.getDescription();
	        this.price = product.getPrice();
	        this.imgUrl = product.getImgUrl();
	    }
	
	public ProductDTO() {
		
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
