package com.Ineuron.bean;

public class Department {

	private String depName;
	private String depId;

	Employee[] employee;

	public Department(String depName, String depId, Employee[] employee) {
		super();
		this.depName = depName;
		this.depId = depId;
		this.employee = employee;
	}

	public void getDepartmentDetails() {

		System.out.println("Department Name: " + depName);
		System.out.println("Department Id:" + depId);

		System.out.println("========================");

		System.out.println("Employee Details:");

		for (Employee empl : employee) {

			System.out.println("Employee id:" + empl.empId);
			System.out.println("Employee name:" + empl.empName);
			System.out.println("Employee address:" + empl.empAddr);
			System.out.println();

		}

	}

}
