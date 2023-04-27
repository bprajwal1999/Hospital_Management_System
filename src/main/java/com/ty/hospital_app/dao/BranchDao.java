package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;

public interface BranchDao 
{
	public Branch saveBranch(int hospital_id, Branch branch);

	public Branch getBranchById(int Branch_id);

	public boolean deleteBranchById(int Branch_id);

	public Branch updateBranchById(int Branch_id, Branch branch);
	
	public List<Branch> getAllBranch();
}
