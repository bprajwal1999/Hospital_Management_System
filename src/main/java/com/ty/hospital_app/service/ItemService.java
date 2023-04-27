package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.ItemDaoImp;
import com.ty.hospital_app.dao.imp.MedOrderDaoImp;
import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.MedOrder;

public class ItemService 
{
	public void saveItem(int mid, Item item) 
	{
		ItemDaoImp daoImp = new ItemDaoImp();
		Item item1 = daoImp.saveItem(mid, item);
		if(item1 !=null)
		{
			System.out.println("Item Saved");
		}
		else
		{
			System.out.println("Item not Saved");
		}
	}
	
	public Item getItemById(int iid)
	{
		ItemDaoImp daoImp = new ItemDaoImp();
		Item item1 = daoImp.getItemById(iid);
		if(item1 != null)
		{
			return item1;
		}
		else
		{
			return null;
		}
	}
	
	public void deleteItemById(int iid) 
	{
		ItemDaoImp daoImp = new ItemDaoImp();
		boolean flag = daoImp.deleteItemById(iid);
		if(flag)
		{
			System.out.println("Item Deleted");
		}
		else
		{
			System.out.println("Item Data Not Deleted");
		}
	}
	
	public Item updateItemById(int iid, Item item)   
	{
		ItemDaoImp daoImp = new ItemDaoImp();
		Item item1 = daoImp.updateItemById(iid, item);
		if(item1 != null)
		{
			//System.out.println("Data Updated");
			return item1;
		}
		else
		{
			return null;
		}
	}
	
	public List<Item> getAllItem() 
	{
		ItemDaoImp daoImp = new ItemDaoImp();
		List<Item> item1 = daoImp.getAllItem();
		if(item1 != null)
		{
			//System.out.println("Data Updated");
			return item1;
		}
		else
		{
			return null;
		}
	}
}
