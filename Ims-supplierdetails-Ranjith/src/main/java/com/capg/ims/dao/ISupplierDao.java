package com.capg.ims.dao;

import java.util.List;

import com.capg.ims.entity.SupplierBean;



public interface ISupplierDao {
	public SupplierBean addSupplier(SupplierBean bean);
	
	public List<SupplierBean> getAllSuppliers(int orderId);
	
	public List<SupplierBean> viewAll() ;
	
}
