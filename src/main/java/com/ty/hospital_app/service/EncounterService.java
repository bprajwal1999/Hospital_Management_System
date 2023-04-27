package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.AddressDaoImp;
import com.ty.hospital_app.dao.imp.EncounterDaoImp;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Encounter;

public class EncounterService 
{
	public void saveEncounter(int branch_id, Encounter encounter) 
	{
		EncounterDaoImp daoImp = new EncounterDaoImp();
		Encounter encounter1 = daoImp.saveEncounter(branch_id, encounter);
		if(encounter1 !=null)
		{
			System.out.println("Encounter Saved");
		}
		else
		{
			System.out.println("Encounter not Saved");
		}
	}
	
	public Encounter getEncounterById(int eid)
	{
		EncounterDaoImp daoImp = new EncounterDaoImp();
		Encounter encounter1 = daoImp.getEncounterById(eid);
		if(encounter1 != null)
		{
			return encounter1;
		}
		else
		{
			return null;
		}
	}
	
	public void deleteEncounterById(int eid) 
	{
		EncounterDaoImp daoImp = new EncounterDaoImp();
		boolean flag = daoImp.deleteEncounterById(eid);
		if(flag)
		{
			System.out.println("Data Deleted");
		}
		else
		{
			System.out.println("Data Not Deleted");
		}
	}
	
	public Encounter updateEncounterById(int eid, Encounter encounter)  
	{
		EncounterDaoImp daoImp = new EncounterDaoImp();
		Encounter encounter1 = daoImp.updateEncounterById(eid, encounter);
		if(encounter1 != null)
		{
			//System.out.println("Data Updated");
			return encounter1;
		}
		else
		{
			return null;
		}
	}
	
	public List<Encounter> getAllEncounter() 
	{
		EncounterDaoImp daoImp = new EncounterDaoImp();
		List<Encounter> encounter1 = daoImp.getAllEncounter();
		if(encounter1 != null)
		{
			//System.out.println("Data Updated");
			return encounter1;
		}
		else
		{
			return null;
		}
	}
}
