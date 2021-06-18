package Service;

import java.util.ArrayList;
import java.util.Scanner;

/************************************************************
 * Purpose : Create a user registration system using regex.
 * 
 * @author sanyukta Nirmal
 * @Version 1.0
 * @since 18-06-2021
 *
 ************************************************************/

public class UserUpdate {
	static Scanner sc = new Scanner(System.in);

	/**
	 * check pattern match for name First name starts with Cap and has minimum 3
	 * characters
	 * 
	 * @param args for main of first name
	 */

	public static void main(String[] args) {
		System.out.println("Welcome in User Registration program");
		UserUpdate user = new UserUpdate();
		user.firstname();
		user.lastname();
	}

	public boolean firstname() {
		System.out.println("Enter name:");
		String name = sc.next();
		boolean valid = name.matches("^[A-Z][a-z]{2,}");
		System.out.println("First Name is:" + name + "\nvalid: " + valid);
		return valid;

	}

	/**
	 * Last name starts with Cap and has minimum 3 characters
	 * @return check pattern  valid with name 
	 */

	public boolean lastname() {
		System.out.println("Enter Lastname:");
		String name = sc.next();
		boolean valid = name.matches("^[A-Z][a-z]{3,}");
		System.out.println("Last Name is:" + name + "\nvalid: " + valid);
		return valid;
	}

}