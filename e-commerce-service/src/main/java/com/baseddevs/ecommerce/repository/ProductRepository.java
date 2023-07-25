package com.baseddevs.ecommerce.repository;

import com.baseddevs.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}