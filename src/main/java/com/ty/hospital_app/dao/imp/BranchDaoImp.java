package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.BranchDao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;

public class BranchDaoImp implements BranchDao
{

	public Branch saveBranch(int hospital_id, Branch branch) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Hospital hospital = entityManager.find(Hospital.class, hospital_id);
		if(hospital != null)
		{
			entityTransaction.begin();
			entityManager.persist(branch);
			entityTransaction.commit();
			return branch;
		}
		else
		{
			return null;
		}
	}

	public Branch getBranchById(int Branch_id) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Branch branch =  entityManager.find(Branch.class, Branch_id);
		return branch;
	}

	public boolean deleteBranchById(int Branch_id) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Branch branch= entityManager.find(Branch.class, Branch_id);
		if(branch!=null)
		{
			entityTransaction.begin();
			entityManager.remove(branch);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Branch updateBranchById(int Branch_id, Branch branch) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Branch Branch1  = entityManager.find(Branch.class, Branch_id);
		if(Branch1 != null)
		{
			branch.setBranch_name(Branch1.getBranch_name());
			branch.setBranch_email(Branch1.getBranch_email());
			branch.setBranch_phno(Branch1.getBranch_phno());
			entityTransaction.begin();
			entityManager.merge(Branch1);
			entityTransaction.commit();
			return Branch1;
		}
		else
		{
			return null;
		}
	}

	public List<Branch> getAllBranch() 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Query query=entityManager.createQuery("select s from Branch s");
		List<Branch> branch = query.getResultList();
		return branch;
	}

}
