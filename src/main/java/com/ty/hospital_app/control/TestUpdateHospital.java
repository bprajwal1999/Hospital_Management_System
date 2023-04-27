package com.ty.hospital_app.control;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class TestUpdateHospital 
{

	public static void main(String[] args) 
	{
		Hospital hospital = new Hospital();
		HospitalService service = new HospitalService();
		hospital.setHospital_id(5);
		hospital.setHospital_name("Apollo");
		hospital.setHospital_website("www.apollo.com");
		service.updateHospitalById(5, hospital);

	}

}
