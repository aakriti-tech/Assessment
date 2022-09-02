package com.globallogic.Assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.Assessment.entity.MerchantEntity;

import com.globallogic.Assessment.repo.MerchantRepo;


@RestController
@RequestMapping("/mer")
public class MerchantController {
	@Autowired
	MerchantRepo repo;
	@GetMapping("/")
	public List<MerchantEntity> showMerchant()
	{
		return repo.findAll();
	}
	@PostMapping("/")
	public MerchantEntity saveMerchant(@RequestBody MerchantEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}
    @PutMapping("/")
    public MerchantEntity updateMerchant(@RequestBody MerchantEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}
    

}
