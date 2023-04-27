package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.ItemDaoImp;
import com.ty.hospital_app.dao.imp.ObservationDaoImp;
import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.Observation;

public class ObservationService 
{
	public void saveObservation(int eid, Observation observation) 
	{
		ObservationDaoImp daoImp = new ObservationDaoImp();
		Observation observation1 = daoImp.saveObservation(eid, observation);
		if(observation1 !=null)
		{
			System.out.println("Observation Saved");
		}
		else
		{
			System.out.println("Observation not Saved");
		}
	}
	
	public Observation getobservationById(int oid)
	{
		ObservationDaoImp daoImp = new ObservationDaoImp();
		Observation observation1 = daoImp.getobservationById(oid);
		if(observation1 != null)
		{
			return observation1;
		}
		else
		{
			return null;
		}
	}
	
	public void deleteObservationById(int oid) 
	{
		ObservationDaoImp daoImp = new ObservationDaoImp();
		boolean flag = daoImp.deleteObservationById(oid);
		if(flag)
		{
			System.out.println("Observation Deleted");
		}
		else
		{
			System.out.println("Observation Data Not Deleted");
		}
	}
	
	public Observation updateObservationById(int oid, Observation observation)   
	{
		ObservationDaoImp daoImp = new ObservationDaoImp();
		Observation observation1 = daoImp.updateObservationById(oid, observation);
		if(observation1 != null)
		{
			return observation1;
		}
		else
		{
			return null;
		}
	}
	
	public List<Observation> getAllObservation() 
	{
		ObservationDaoImp daoImp = new ObservationDaoImp();
		List<Observation> observation1 = daoImp.getAllObservation();
		if(observation1 != null)
		{
			//System.out.println("Data Updated");
			return observation1;
		}
		else
		{
			return null;
		}
	}
	
	public List<Observation> getObservationByDoctorName(String name) 
	{
		ObservationDaoImp daoImp = new ObservationDaoImp();
		List<Observation> observation1 = daoImp.getObservationByDoctorName(name);
		if(observation1 != null)
		{
			return observation1;
		}
		else
		{
			return null;
		}
	}
}
