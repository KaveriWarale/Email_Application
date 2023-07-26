package com.csi.email;

import java.util.Scanner;

public class EmailApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter Employee's First Name and Last Name:");
			String firstName = scanner.next();
			String lastName = scanner.next();
			Employee employee = new Employee(firstName, lastName);
			employee.selectDepartment();
			scanner.close();
		}
	}
}
