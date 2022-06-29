package com.RMgX.sagarprasad.service;

import java.util.Optional;

import com.RMgX.sagarprasad.Entity.AssetsEntity.Employee;
import com.RMgX.sagarprasad.Entity.EmployeeEntity;



public interface EmployeeEntityService {

	Iterable<EmployeeEntity> getALl();

	
	public String deleteById(int id);
	
	Optional<EmployeeEntity> getById(int id);


	String update(EmployeeEntity EmployeeEntity);


	String add(EmployeeEntity EmployeeEntity);


	Object getAllById();


	Object getAllByEmployee();


	Object createEmployee(Employee employee);

}
