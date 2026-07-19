package com.portfolio.ChandraHari.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.ChandraHari.Entity.MyEntity;
import com.portfolio.ChandraHari.Repo.Repository;



@RestController
@CrossOrigin 
public class MyController {
	@Autowired 
	private Repository myRepo;
	
	
	@PostMapping("/Contact")
	public MyEntity saveMessage(@RequestBody MyEntity contact) {
		return myRepo.save(contact);
	}
	
}
