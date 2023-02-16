package com.osmanowski.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.osmanowski.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
