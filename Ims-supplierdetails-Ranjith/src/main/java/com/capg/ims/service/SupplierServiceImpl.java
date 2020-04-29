package com.capg.ims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.ims.dao.ISupplierDao;
import com.capg.ims.entity.SupplierBean;
import com.capg.ims.service.ISupplierService;



@Service
public class SupplierServiceImpl  implements ISupplierService {

	@Autowired
	ISupplierDao dao;
	/** @author Ranjith :
	 * This insertSupplier method will 
	 * insert details into the entity **/
	@Override
	public SupplierBean addSupplier(SupplierBean Bean) {
		// TODO Auto-generated method stub
		return dao.addSupplier(Bean);
	}
	
	/** @author Ranjith :
	 * This getRSupplier method will
	 *  retrieve the details(object) of Supplier present 
	 * in particular id
	 **/
	@Override
	public List<SupplierBean> getAllSuppliers(int orderId) {
		// TODO Auto-generated method stub
		return dao.getAllSuppliers(orderId);
	}
	@Override
	public List<SupplierBean> viewAll() {
		// TODO Auto-generated method stub
		return dao.viewAll();
	}
	

}

