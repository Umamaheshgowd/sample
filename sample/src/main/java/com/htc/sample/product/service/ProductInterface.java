package com.htc.sample.product.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.htc.sample.product.entity.Product;


public interface ProductInterface extends JpaRepository<Product, Long>{

}
