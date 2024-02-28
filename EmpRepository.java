package com.example.SpringData;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpRepository  extends JpaRepository<Employee,Integer>{
//JpaRepository to data store in database
	//CrudRepository for curd operation
}
