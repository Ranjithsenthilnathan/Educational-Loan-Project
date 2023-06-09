package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Integer>
{
	public UserModel findByEmail(String email);
}
