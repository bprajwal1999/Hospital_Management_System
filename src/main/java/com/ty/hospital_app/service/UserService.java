package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.PersonDaoImp;
import com.ty.hospital_app.dao.imp.UserDaoImp;
import com.ty.hospital_app.dto.Person;
import com.ty.hospital_app.dto.User;

public class UserService 
{
	public void saveUser(User user) 
	{
		UserDaoImp daoImp = new UserDaoImp();
		User user1 = daoImp.saveUser(user);
		if(user1 !=null)
		{
			System.out.println("User Saved");
		}
		else
		{
			System.out.println("User not Saved");
		}
	}
	public User getUserById(int uid)
	{
		UserDaoImp daoImp = new UserDaoImp();
		User user1 = daoImp.getUserById(uid);
		if(user1 != null)
		{
			return user1;
		}
		else
		{
			return null;
		}
	}
	
	public void deleteUserById(int uid)   
	{
		UserDaoImp daoImp = new UserDaoImp();
		boolean flag = daoImp.deleteUserById(uid);
		if(flag)
		{
			System.out.println("User Deleted");
		}
		else
		{
			System.out.println("User Data Not Deleted");
		}
	}
	
	public User updateUserById(int uid, User user) 
	{
		UserDaoImp daoImp = new UserDaoImp();
		User user1 = daoImp.updateUserById(uid, user);
		if(user1 != null)
		{
			return user1;
		}
		else
		{
			return null;
		}
	}
	
	public List<User> getAlluser()   
	{
		UserDaoImp daoImp = new UserDaoImp();
		List<User> user1 = daoImp.getAlluser();
		if(user1 != null)
		{
			//System.out.println("Data Updated");
			return user1;
		}
		else
		{
			return null;
		}
	}
	
	public List<User> getUserByRole(String role)   
	{
		UserDaoImp daoImp = new UserDaoImp();
		List<User> user1 = daoImp.getUserByRole(role);
		if(user1 != null)
		{
			//System.out.println("Data Updated");
			return user1;
		}
		else
		{
			return null;
		}
	}
}
