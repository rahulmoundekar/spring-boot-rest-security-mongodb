package com.app.sbrsmd.repositories;

import org.springframework.data.repository.CrudRepository;

import com.app.sbrsmd.models.Product;

public interface ProductRepository extends CrudRepository<Product, String> {
	
	@Override
    void delete(Product deleted);
}
