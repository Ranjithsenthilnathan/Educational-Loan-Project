package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.LoanApplicationModel;
import com.example.app.model.UserModel;
import com.example.app.service.ApiServiceImpl;

@RestController
@CrossOrigin("http://localhost:3000")
public class ApiController
{
	@Autowired
	ApiServiceImpl apiServImpl;

	@PostMapping("/user/login")
	public String login(@RequestBody UserModel u) {
		return apiServImpl.login(u.getEmail(), u.getPassword());
	}

	@PostMapping("/user/signup")
	public UserModel signup(@RequestBody UserModel u) {
		return apiServImpl.signup(u);
	}
	
	@GetMapping("/admin/getAllLoans")
	public List<LoanApplicationModel> getAllLoans(){
		return apiServImpl.getAllLoans();
	}
	
	@GetMapping("/user/getProfile")
	public List<UserModel> getAllUsers(){
		return apiServImpl.getAllUsers();
	}
	
	@GetMapping("user/viewLoan/{user}")
	public LoanApplicationModel viewLoan(@PathVariable int user) {
		return apiServImpl.viewLoan(user);
	}
	@DeleteMapping("/user/delete/{id}")
	public String delete(@PathVariable int id)
	{
		return apiServImpl.delete(id);
	}
	@PutMapping("/user/update")
	public UserModel update(@RequestBody UserModel user) {
		return apiServImpl.signup(user);
	}
}
