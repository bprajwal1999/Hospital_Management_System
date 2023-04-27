package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.MedOrderDao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.MedOrder;

public class MedOrderDaoImp implements MedOrderDao
{

	public MedOrder saveMedOrder(int eid, MedOrder medorder) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Encounter encounter = entityManager.find(Encounter.class, eid);
		if(encounter != null)
		{
			entityTransaction.begin();
			entityManager.persist(medorder);
			entityTransaction.commit();
			return medorder;
		}
		else
		{
			return null;
		}
	}

	public MedOrder getMedOrderById(int mid) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		MedOrder medorder =  entityManager.find(MedOrder.class, mid);
		return medorder;
	}

	public boolean deleteMedOrderById(int mid) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		MedOrder medorder = entityManager.find(MedOrder.class, mid);
		if(medorder !=null)
		{
			entityTransaction.begin();
			entityManager.remove(medorder);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public MedOrder updateMedOrderById(int mid, MedOrder medorder) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		MedOrder medorder1  = entityManager.find(MedOrder.class, mid);
		if(medorder1 != null)
		{
			medorder.setDname(medorder.getDname());
			medorder.setOrderdate(medorder.getOrderdate());

			entityTransaction.begin();
			entityManager.merge(medorder1);
			entityTransaction.commit();
			return medorder1;
		}
		else
		{
			return null;
		}
	}

	public List<MedOrder> getAllMedOrder() 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Query query=entityManager.createQuery("select s from MedOrder s");
		List<MedOrder> medorder = query.getResultList();
		return medorder;
	}

	public List<MedOrder> getAllMedOrderByDoctorName(String name) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Query query=entityManager.createQuery("select s from MedOrder s where dname = ?1");
		query.setParameter(1, name);
		List<MedOrder> medorder = query.getResultList();
		return medorder;
	}
}
