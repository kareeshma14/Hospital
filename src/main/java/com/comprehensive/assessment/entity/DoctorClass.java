package com.comprehensive.assessment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class DoctorClass {
	@Id
	private int id;	
	private String name;
	private int salary;
	private String specialization;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}	
	public DoctorClass(int id, String name, int salary, String specialization) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.specialization = specialization;
	}
	public DoctorClass() {
		super();
		// TODO Auto-generated constructor stub
	}
}
