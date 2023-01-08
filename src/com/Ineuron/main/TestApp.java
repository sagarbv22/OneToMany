package com.Ineuron.main;

import com.Ineuron.bean.Department;
import com.Ineuron.bean.Employee;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee("Sagar", "ide12", "Bpura");
		Employee emp2 = new Employee("Manu", "ide13", "Gpura");
		Employee emp3 = new Employee("Gaja", "ide14", "Hpura");

		Employee[] employee = new Employee[3];

		employee[0] = emp1;
		employee[1] = emp2;
		employee[2] = emp3;

		Department department = new Department("SDE", "GDS12", employee);

		department.getDepartmentDetails();

	}

}
