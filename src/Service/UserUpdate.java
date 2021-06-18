package Service;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/************************************************************
 * Purpose : Create a user registration system using regex.
 * 
 * @author sanyukta Nirmal
 * @Version 1.0
 * @since 18-06-2021
 *
 ************************************************************/

public class UserUpdate {
	ArrayList<String> emails = new ArrayList<String>();
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
		user.emailId();
		user.MobileNo();

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
	 * 
	 * @return check pattern valid with name
	 */

	public boolean lastname() {
		System.out.println("Enter Lastname:");
		String name = sc.next();
		boolean valid = name.matches("^[A-Z][a-z]{3,}");
		System.out.println("Last Name is:" + name + "\nvalid: " + valid);
		return valid;
	}
	
	/**
	 * Email Validation pattern
	 */

	public boolean emailId() {
		System.out.println("\nEmail validation Samples");

		emails.add("abc@abc.com");
		emails.add("abc-100@abc.co.in");
		emails.add("abc111@abc.com");
		emails.add("abc.yz@abc.com.com");
		emails.add("abc#@abc.co.in");
		emails.add("abc@abc.com.com");

		String regex = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(regex);

		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			System.out.println(email + " : " + matcher.matches());
		}
		return regex != null;
	}
	/**
	 * Mobile number pattern 
	 *match number formate with country code
	 */
	public void MobileNo() {
		System.out.println("Enter MobileNo :");
		String MobileNo = sc.next();
		boolean valid = MobileNo.matches( "^[1-9][0-9][1-9]{10}$" );
		System.out.println("MobileNo is:" + MobileNo + "\nvalid: " + valid);
		System.out.println(valid);
	}
}

