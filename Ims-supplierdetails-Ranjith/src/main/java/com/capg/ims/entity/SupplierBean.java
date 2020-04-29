package com.capg.ims.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name="Supplier_Spring")
public class SupplierBean {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	 private int orderId;
	@NotEmpty(message = "Please provide a name")
    //private String name;
	 private String supplierName;
	private String supplierAddress;
	private long supplierNumber;
	
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierAddress() {
		return supplierAddress;
	}
	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	public long getSupplierNumber() {
		return supplierNumber;
	}
	public void setSupplierNumber(long supplierNumber) {
		this.supplierNumber = supplierNumber;
	}
	}
	