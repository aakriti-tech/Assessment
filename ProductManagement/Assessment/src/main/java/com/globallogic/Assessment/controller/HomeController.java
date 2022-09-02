package com.globallogic.Assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.Assessment.entity.AdminEntity;
import com.globallogic.Assessment.repo.AdminRepo;

@RestController
@RequestMapping("/ho")
public class HomeController {
	@Autowired
	AdminRepo repo;
	@GetMapping("/")
	public List<AdminEntity> showAdmin()
	{
		return repo.findAll();
	}
	@PostMapping("/")
	public AdminEntity saveAdmin(@RequestBody AdminEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}
    @PutMapping("/")
    public AdminEntity updateAdmin(@RequestBody AdminEntity  ad)
	{
		System.err.println(ad);
		repo.save(ad);
		System.err.println(ad);
		return ad;
	}
    @DeleteMapping("/{id}")
    public String deleteAdmin(@PathVariable("id") int id)
	{
    	System.err.println("deleted id is : "+id);
		repo.deleteById(id);
		return "Record Has been deleted!";
	}
    
	

}
