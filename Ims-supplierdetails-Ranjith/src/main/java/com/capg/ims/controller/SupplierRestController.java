package com.capg.ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.ims.entity.SupplierBean;
import com.capg.ims.service.SupplierServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/supplier")
@RestController
public class SupplierRestController {
	@Autowired
	SupplierServiceImpl supplierserviceimpl;

	@PostMapping(path="/insert")
	/**
	 * @author Ranjith : This insertsupplier method will insert details into
	 *         the entity of Supplierbean
	 **/
	public ResponseEntity<Boolean> createSupplier(@RequestBody SupplierBean bean) { 
		SupplierBean supplierbean = supplierserviceimpl.addSupplier(bean);
		
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" +responseEntity);
		return responseEntity;
		
	}
	/**
	 * @author Ranjith : This getSupplier method will retrieve the
	 *         details(object) of Supplier present in particular id
	 **/
	@GetMapping("/getSupplier/{orderId}")
	public ResponseEntity<List<SupplierBean>> getallsuppliers(@PathVariable int orderId) {

			List<SupplierBean> bean = supplierserviceimpl.getAllSuppliers(orderId);
			return new ResponseEntity<List<SupplierBean>>(bean ,new HttpHeaders(),HttpStatus.OK);
		
		//return SupplierBean.getSupplierName() +"your orderId is" +SupplierBean.getorderId();
			
		} 
	@GetMapping("/viewAll")
	public ResponseEntity<List<SupplierBean>> viewall() {

			List<SupplierBean> bean = supplierserviceimpl.viewAll();
			return new ResponseEntity<List<SupplierBean>>(bean ,new HttpHeaders(),HttpStatus.OK);
	}
	@ExceptionHandler(Exception.class)
	public String inValid(Exception e) {
		return e.getMessage();
	}
}



