package com.example.app.service;

import java.util.List;

import com.example.app.model.LoanApplicationModel;
import com.example.app.model.UserModel;
public interface ApiServiceImpl
{
	public String login(String email, String password);
	public UserModel signup(UserModel u);
	public List<LoanApplicationModel> getAllLoans();
	public List<UserModel> getAllUsers();
	public LoanApplicationModel viewLoan(int user);
	public String delete(int id);
	public UserModel update(UserModel user);
}
