package com.ty.hospital_app.control;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class GetHospitalById 
{

	public static void main(String[] args) 
	{
		HospitalService service = new HospitalService();
		Hospital hospital = service.getHospitalById(3);
		System.out.println("Hospital ID is: "+hospital.getHospital_id());
		System.out.println("Hospital Name is: "+hospital.getHospital_name());
		System.out.println("Hospital Website is: "+hospital.getHospital_website());
		System.out.println("*********************************");
		

	}

}
