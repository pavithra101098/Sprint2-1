package com.capg.ims.service;

import java.util.List;

import com.capg.ims.entity.SupplierBean;

public interface ISupplierService {
public SupplierBean addSupplier(SupplierBean bean);
	
	public List<SupplierBean> getAllSuppliers(int orderId);
	public List<SupplierBean> viewAll() ;

}
