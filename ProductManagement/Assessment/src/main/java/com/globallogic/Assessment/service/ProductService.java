package com.globallogic.Assessment.service;

import java.util.List;

import com.globallogic.Assessment.entity.ProductEntity;


public interface ProductService {
	List<ProductEntity> findByName(String keyword);
	

}
