package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.ObservationDaoImp;
import com.ty.hospital_app.dao.imp.PersonDaoImp;
import com.ty.hospital_app.dto.Observation;
import com.ty.hospital_app.dto.Person;

public class PersonService 
{
	public void savePerson(int eid, Person person) 
	{
		PersonDaoImp daoImp = new PersonDaoImp();
		Person person1 = daoImp.savePerson(eid, person);
		if(person1 !=null)
		{
			System.out.println("Person Saved");
		}
		else
		{
			System.out.println("Person not Saved");
		}
	}
	
	public Person getPersonById(int pid)
	{
		PersonDaoImp daoImp = new PersonDaoImp();
		Person person1 = daoImp.getPersonById(pid);
		if(person1 != null)
		{
			return person1;
		}
		else
		{
			return null;
		}
	}
	
	public void deletePersonById(int pid)  
	{
		PersonDaoImp daoImp = new PersonDaoImp();
		boolean flag = daoImp.deletePersonById(pid);
		if(flag)
		{
			System.out.println("Person Deleted");
		}
		else
		{
			System.out.println("Person Data Not Deleted");
		}
	}
	
	public Person updatePersonById(int pid, Person person) 
	{
		PersonDaoImp daoImp = new PersonDaoImp();
		Person person1 = daoImp.updatePersonById(pid, person);
		if(person1 != null)
		{
			return person1;
		}
		else
		{
			return null;
		}
	}
	
	public List<Person> getAllPerson()  
	{
		PersonDaoImp daoImp = new PersonDaoImp();
		List<Person> person1 = daoImp.getAllPerson();
		if(person1 != null)
		{
			//System.out.println("Data Updated");
			return person1;
		}
		else
		{
			return null;
		}
	}
	
	public List<Person> getPersonByGender(String gender)   
	{
		PersonDaoImp daoImp = new PersonDaoImp();
		List<Person> person1 = daoImp.getPersonByGender(gender);
		if(person1 != null)
		{
			return person1;
		}
		else
		{
			return null;
		}
	}
	
	public List<Person> getPersonByage(int age)    
	{
		PersonDaoImp daoImp = new PersonDaoImp();
		List<Person> person1 = daoImp.getPersonByage(age);
		if(person1 != null)
		{
			return person1;
		}
		else
		{
			return null;
		}
	}
	
	public List<Person> getPersonByPhone(long phone)    
	{
		PersonDaoImp daoImp = new PersonDaoImp();
		List<Person> person1 = daoImp.getPersonByPhone(phone);
		if(person1 != null)
		{
			return person1;
		}
		else
		{
			return null;
		}
	}	
}
