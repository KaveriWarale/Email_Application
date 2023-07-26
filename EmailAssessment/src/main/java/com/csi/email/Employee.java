package com.csi.email;
import java.util.Scanner;
public class Employee {
	static String firstName;
	static String lastName;
	static String email;
	//Scanner scanner = new Scanner(System.in);
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public static void selectDepartment() {
		System.out.println("\n Please enter Department: \n 1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			generateEmailAddress("tech");
			break;
		case 2:
			generateEmailAddress("admin");
			break;
		case 3:
			generateEmailAddress("hr");
			break;
		case 4:
			generateEmailAddress("legal");
			break;
		default:
			break;
		}
	}
	private static String generatePassword() {
		String number = "0123456789";
		String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetter = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacter = "+/&?@#$%";

		String passwordSet = number + capitalLetter + smallLetter + specialCharacter;
		char password[] = new char[8];
		for (int i = 0; i < password.length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
	private static String generateEmailAddress(String department) {
		email= firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + "csi.com";
		showCredentials(email);
		return email;
	}

	public static void showCredentials(String emial) {
		System.out.println("Employee Name: " + firstName + " " + lastName);
		System.out.println("Company Email: " + emial);
		System.out.println("Password: " + generatePassword());
	}
}
