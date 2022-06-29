package com.RMgX.sagarprasad.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.RMgX.sagarprasad.Entity.AssetsEntity.Employee;
import com.RMgX.sagarprasad.Entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long>{

	Object ok();

	Employee saveAll(Employee employee);

	}

