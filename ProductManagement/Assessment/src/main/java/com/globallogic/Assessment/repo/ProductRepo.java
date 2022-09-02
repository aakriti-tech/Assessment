package com.globallogic.Assessment.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.globallogic.Assessment.entity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer>{
	@Query("SELECT p FROM ProductEntity WHERE"+ "p.name LIKE('%', :keyword, '%')")
	

	List<ProductEntity> findByName(String keyword);

	

}
