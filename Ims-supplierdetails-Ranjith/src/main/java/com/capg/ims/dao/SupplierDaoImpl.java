package com.capg.ims.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.capg.ims.entity.SupplierBean;


import org.springframework.stereotype.Repository;

import com.capg.ims.dao.ISupplierDao;
import com.capg.ims.entity.SupplierBean;

//import com.capg.im.dao.ITrackOrderDao;

@Repository
@Transactional
public class SupplierDaoImpl implements ISupplierDao{

	@PersistenceContext
	EntityManager entitymanager;
	
	@Override
	/** @author Ranjith :
	 * This insertSupplier method will 
	 * insert details into the entity of Supplierbean **/
	
	public SupplierBean addSupplier(SupplierBean bean) {
		entitymanager.persist(bean);
		// TODO Auto-generated method stub
		return bean;
	}
	@Override
	/** @author Ranjith:
	 * This getSupplier method will
	 *  retrieve the details(object) of Supplier present 
	 * in particular id
	 **/
	public List<SupplierBean> getAllSuppliers(int orderId ) {
		// TODO Auto-generated method stub
		TypedQuery<SupplierBean> query =entitymanager.createQuery("from SupplierBean", SupplierBean.class);
		return query.getResultList();
	}
	@Override
	/** @author Ranjith:
	 * This getSupplier method will
	 *  retrieve the details(object) of Supplier present 
	 * in particular id
	 **/
	public List<SupplierBean> viewAll() {
		// TODO Auto-generated method stub
		TypedQuery<SupplierBean> query =entitymanager.createQuery("from SupplierBean", SupplierBean.class);
		return query.getResultList();
	
}}
	


