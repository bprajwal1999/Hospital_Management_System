package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.HospitalDaoImp;
import com.ty.hospital_app.dto.Hospital;

public class HospitalService 
{
	public void saveHospital(Hospital hospital)
	{
		HospitalDaoImp daoImp = new HospitalDaoImp();
		Hospital hospital1 = daoImp.saveHospital(hospital);
		if(hospital1 !=null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunately data not Saved");
		}
	}
	
	public Hospital getHospitalById(int hospital_id)
	{
		HospitalDaoImp daoImp = new HospitalDaoImp();
		Hospital hospital1 = daoImp.getHospitalById(hospital_id);
		if(hospital1 != null)
		{
			return hospital1;
		}
		else
		{
			return null;
		}
	}
	
	public void deleteHospital(int hospital_id)
	{
		HospitalDaoImp daoImp = new HospitalDaoImp();
		boolean flag = daoImp.deleteHospitalById(hospital_id);
		if(flag)
		{
			System.out.println("Data Deleted");
		}
		else
		{
			System.out.println("Data Not Deleted");
		}
	}
	
	public Hospital updateHospitalById(int hospital_id, Hospital hospital)
	{
		HospitalDaoImp daoImp = new HospitalDaoImp();
		Hospital hospital1 = daoImp.updateHospitalById(hospital_id, hospital);
		if(hospital1 != null)
		{
			//System.out.println("Data Updated");
			return hospital1;
		}
		else
		{
			return null;
		}
	}
}
