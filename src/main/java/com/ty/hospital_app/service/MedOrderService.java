package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.EncounterDaoImp;
import com.ty.hospital_app.dao.imp.MedOrderDaoImp;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.MedOrder;

public class MedOrderService 
{
	public void saveMedOrder(int eid, MedOrder medorder)  
	{
		MedOrderDaoImp daoImp = new MedOrderDaoImp();
		MedOrder medorder1 = daoImp.saveMedOrder(eid, medorder);
		if(medorder1 !=null)
		{
			System.out.println("MedOrder Saved");
		}
		else
		{
			System.out.println("MedOrder not Saved");
		}
	}
	
	public MedOrder getMedOrderById(int mid)
	{
		MedOrderDaoImp daoImp = new MedOrderDaoImp();
		MedOrder medorder1 = daoImp.getMedOrderById(mid);
		if(medorder1 != null)
		{
			return medorder1;
		}
		else
		{
			return null;
		}
	}
	
	public void deleteMedOrderById(int mid)  
	{
		MedOrderDaoImp daoImp = new MedOrderDaoImp();
		boolean flag = daoImp.deleteMedOrderById(mid);
		if(flag)
		{
			System.out.println("MedOrder Deleted");
		}
		else
		{
			System.out.println("MedOrder Data Not Deleted");
		}
	}
	
	public MedOrder updateMedOrderById(int mid, MedOrder medorder)   
	{
		MedOrderDaoImp daoImp = new MedOrderDaoImp();
		MedOrder medorder1 = daoImp.updateMedOrderById(mid, medorder);
		if(medorder1 != null)
		{
			//System.out.println("Data Updated");
			return medorder1;
		}
		else
		{
			return null;
		}
	}
	
	public List<MedOrder> getAllMedOrder() 
	{
		MedOrderDaoImp daoImp = new MedOrderDaoImp();
		List<MedOrder> medorder1 = daoImp.getAllMedOrder();
		if(medorder1 != null)
		{
			//System.out.println("Data Updated");
			return medorder1;
		}
		else
		{
			return null;
		}
	}
	
	public List<MedOrder> getAllMedOrderByDoctorName(String name)
	{
		MedOrderDaoImp daoImp = new MedOrderDaoImp();
		List<MedOrder> medorder1 = daoImp.getAllMedOrderByDoctorName(name);
		if(medorder1 != null)
		{
			
			return medorder1;
		}
		else
		{
			return null;
		}
	}
	
	
}
