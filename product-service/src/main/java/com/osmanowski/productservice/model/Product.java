package com.osmanowski.productservice.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value = "product")
@NoArgsConstructor
@Builder
@Data
@AllArgsConstructor
public class Product {
	@Id
	private String id;
	private String name;
	private String description;
	private BigDecimal price;
	
}
