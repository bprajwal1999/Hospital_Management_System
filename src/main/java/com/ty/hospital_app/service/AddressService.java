package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.AddressDaoImp;
import com.ty.hospital_app.dao.imp.BranchDaoImp;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;

public class AddressService 
{
	public void saveAddress(int branch_id, Address address)
	{
		AddressDaoImp daoImp = new AddressDaoImp();
		Address address1 = daoImp.saveAddress(branch_id, address);
		if(address1 !=null)
		{
			System.out.println("Address Saved");
		}
		else
		{
			System.out.println("Address not Saved");
		}
	}
	
	public Address getAddressById(int aid)
	{
		AddressDaoImp daoImp = new AddressDaoImp();
		Address address1 = daoImp.getAddressById(aid);
		if(address1 != null)
		{
			return address1;
		}
		else
		{
			return null;
		}
	}
	
	public void deleteAddressById(int aid)
	{
		AddressDaoImp daoImp = new AddressDaoImp();
		boolean flag = daoImp.deleteAddressById(aid);
		if(flag)
		{
			System.out.println("Data Deleted");
		}
		else
		{
			System.out.println("Data Not Deleted");
		}
	}
	
	public Address updateAddressById(int aid, Address address) 
	{
		AddressDaoImp daoImp = new AddressDaoImp();
		Address address1 = daoImp.updateAddressById(aid, address);
		if(address1 != null)
		{
			//System.out.println("Data Updated");
			return address1;
		}
		else
		{
			return null;
		}
	}
	
	public List<Address> getAddressAll()
	{
		AddressDaoImp daoImp = new AddressDaoImp();
		List<Address> address1 = daoImp.getAddressAll();
		if(address1 != null)
		{
			//System.out.println("Data Updated");
			return address1;
		}
		else
		{
			return null;
		}
	}
}
