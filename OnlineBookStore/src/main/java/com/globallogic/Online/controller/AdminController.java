package com.globallogic.Online.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.Online.entity.BookEntity;
import com.globallogic.Online.repo.BookRepo;

@RestController
public class AdminController {
	@Autowired
    BookRepo repo;

	@GetMapping("/show")
	public List<BookEntity> showBooks()
	{
		return repo.findAll();
	}
	
	@PostMapping("/add")
	public BookEntity addBook(@RequestBody BookEntity b1)
	{
		return repo.save(b1);
	}
	
	@PutMapping("/update")
	public BookEntity update(@RequestBody BookEntity b1)
	{
		return repo.save(b1);
	}
	

    @DeleteMapping(path = "/delete/{id}")
    public String deleteBook(@PathVariable long id){
    	System.err.println("deleted id is : "+id);
		repo.deleteById(id);
		return "Record Has been deleted!";
    }


}
