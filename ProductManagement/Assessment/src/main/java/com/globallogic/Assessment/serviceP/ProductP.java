package com.globallogic.Assessment.serviceP;

import org.springframework.stereotype.Service;

import com.globallogic.Assessment.entity.ProductEntity;
import com.globallogic.Assessment.repo.ProductRepo;
import com.globallogic.Assessment.service.ProductService;

import antlr.collections.List;

@Service
public class ProductP implements ProductService{
	public ProductRepo repo;
	@Override
	public List<ProductEntity> findByName(String keyword) {
		
		List<ProductEntity> pro = repo.findByName(keyword);
		
		return pro;
	}
	public ProductP(ProductRepo repo) {
		super();
		this.repo = repo;
	}

	

}
