package com.htc.sample.product.controler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.htc.sample.product.dto.ProductDto;
import com.htc.sample.product.entity.Product;
import com.htc.sample.product.service.ProductInterface;

@RestController
@RequestMapping("/api")
public class ProductControler {
	
	@Autowired
	private ProductInterface productInterface;
	
	
	@GetMapping("/Products/byId/{productId}") 
	public Product getPatientById(@PathVariable Long productId) {
		Product product =null;
		product=productInterface.findById(productId).get();
		return product;
		}
	

	@GetMapping("/Products/getallproduct")
	public List<Product> getAllProducts(){
		return productInterface.findAll();
	}
	
	@PostMapping("/addproducts") 
	public Product createProduct(@RequestBody ProductDto productDto) {
		   
		Product product=new Product(productDto.getProductName(),productDto.getProductType());
		 return productInterface.save(product);
	}


	@DeleteMapping("/deleteproducts/{productId}")
	  void deleteProduct(@PathVariable Long productId) {
		productInterface.deleteById(productId);
	  }

	


}
