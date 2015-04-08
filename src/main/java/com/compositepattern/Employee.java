package com.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private String dept;
	private double salary;
	private List<Employee> subOrdinates;
	
	public Employee(String name,String dept,double salary)
	{
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		subOrdinates=new ArrayList<Employee>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Employee> getSubOrdinates() {
		return subOrdinates;
	}

	public void setSubOrdinates(List<Employee> subOrdinates) {
		this.subOrdinates = subOrdinates;
	}
	
	public void add(Employee e)
	{
		subOrdinates.add(e);
	}
	
	public String toString()
	{
		String str="Name : "+name+"  Dept : "+dept+"  Salary :"+salary;
		return str;
	}

}
