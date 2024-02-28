package com.example.SpringData;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
@Id
private Integer empid;
private String ename;
private Integer salary;

public Employee() {
	}

public Employee(Integer empid, String ename, Integer salary) {
	super();
	this.empid = empid;
	this.ename = ename;
	this.salary = salary;
}

public Integer getEmpid() {
	return empid;
}

public void setEmpid(Integer empid) {
	this.empid = empid;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public Integer getSalary() {
	return salary;
}

public void setSalary(Integer salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
}

@Override
public int hashCode() {
	return Objects.hash(empid, ename, salary);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(empid, other.empid) && Objects.equals(ename, other.ename)
			&& Objects.equals(salary, other.salary);
}


}
