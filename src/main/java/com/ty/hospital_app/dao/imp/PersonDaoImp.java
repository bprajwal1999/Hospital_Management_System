package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.PersonDao;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Observation;
import com.ty.hospital_app.dto.Person;

public class PersonDaoImp implements PersonDao 
{

	public Person savePerson(int eid, Person person) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Encounter encounter = entityManager.find(Encounter.class, eid);
		if(encounter != null)
		{
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();
			return person;
		}
		else
		{
			return null;
		}
		
	}

	public Person getPersonById(int pid) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Person person =  entityManager.find(Person.class, pid);
		return person;
		
	}

	public boolean deletePersonById(int pid) 
	{

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Person person = entityManager.find(Person.class, pid);
		if(person !=null)
		{
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Person updatePersonById(int pid, Person person) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Person person1  = entityManager.find(Person.class, pid);
		if(person1 != null)
		{
			person.setName(person.getName());
			person.setGender(person.getGender());
			person.setAge(person.getAge());
			

			entityTransaction.begin();
			entityManager.merge(person1);
			entityTransaction.commit();
			return person1;
		}
		else
		{
			return null;
		}
		
	}

	public List<Person> getAllPerson() 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Query query=entityManager.createQuery("select s from Person s ");
		List<Person> person = query.getResultList();
		return person;
		
	}

	public List<Person> getPersonByGender(String gender) 
	{
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Query query=entityManager.createQuery("select s from Person s where gender = ?1");
		query.setParameter(gender, 1);
		List<Person> person = query.getResultList();
		return person;
	}

	public List<Person> getPersonByage(int age) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Query query=entityManager.createQuery("select s from Person s where age = ?1");
		query.setParameter(age, 1);
		List<Person> person = query.getResultList();
		return person;
		
	}

	public List<Person> getPersonByPhone(long phone) 
	{
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Query query=entityManager.createQuery("select s from Person s where phno = ?1");
		query.setParameter(1, phone);
		List<Person> person = query.getResultList();
		return person;
	}

}
