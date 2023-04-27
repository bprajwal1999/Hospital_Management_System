package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Person;
import com.ty.hospital_app.dto.User;

public interface UserDao 
{
	public User saveUser(User user);

	public User getUserById(int uid);

	public boolean deleteUserById(int uid);

	public User updateUserById(int uid, User user);
	
	public List<User> getAlluser();
	
	public List<User> getUserByRole(String role);
}
