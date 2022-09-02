package com.globallogic.Assessment.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.globallogic.Assessment.entity.ProductEntity;
import com.globallogic.Assessment.repo.ProductRepo;


@RestController
@RequestMapping("/pro")
public class ProductController {
	@Autowired
	ProductRepo repo;
	@GetMapping("/")
	public List<ProductEntity> showProduct()
	{
		return repo.findAll();
	}
	@GetMapping("/search")
	public ResponseEntity <List<ProductEntity>> findByName(String keyword){
		return ResponseEntity.ok(repo.findByName(keyword));
	}
	@PostMapping("/")
	public ProductEntity saveProduct(@RequestBody ProductEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}
    @PutMapping("/")
    public ProductEntity updateProduct(@RequestBody ProductEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}
    
   
    
	

}
