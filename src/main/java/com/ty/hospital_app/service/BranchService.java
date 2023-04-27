package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.BranchDaoImp;
import com.ty.hospital_app.dao.imp.HospitalDaoImp;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;

public class BranchService 
{
	public void saveBranch(int hospital_id, Branch branch)
	{
		BranchDaoImp daoImp = new BranchDaoImp();
		Branch Branch1 = daoImp.saveBranch(hospital_id, branch);
		if(Branch1 !=null)
		{
			System.out.println("Branch Saved");
		}
		else
		{
			System.out.println("Unfortunately Branch not Saved");
		}
	}
	
	public Branch getBranchByid(int Branch_id)
	{
		BranchDaoImp daoImp = new BranchDaoImp();
		Branch branch1 = daoImp.getBranchById(Branch_id);
		if(branch1 != null)
		{
			return branch1;
		}
		else
		{
			return null;
		}
	}
	
	public void deleteBranch(int Branch_id)
	{
		BranchDaoImp daoImp = new BranchDaoImp();
		boolean flag = daoImp.deleteBranchById(Branch_id);
		if(flag)
		{
			System.out.println("Data Deleted");
		}
		else
		{
			System.out.println("Data Not Deleted");
		}
	}
	
	public Branch updateBranchById(int Branch_id, Branch branch)
	{
		BranchDaoImp daoImp = new BranchDaoImp();
		Branch branch1 = daoImp.updateBranchById(Branch_id, branch);
		if(branch1 != null)
		{
			//System.out.println("Data Updated");
			return branch1;
		}
		else
		{
			return null;
		}
	}
	
	public List<Branch> getAllBranch()
	{
		BranchDaoImp daoImp = new BranchDaoImp();
		List<Branch> branch1 = daoImp.getAllBranch();
		if(branch1 != null)
		{
			//System.out.println("Data Updated");
			return branch1;
		}
		else
		{
			return null;
		}
	}
	
	
}
