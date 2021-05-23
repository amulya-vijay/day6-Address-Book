package com.addressbook;

import java.util.Scanner;
import java.util.ArrayList;


class Info{
	
	ArrayList<String> info = new ArrayList<String>();
	
	ArrayList<String> addressInfo() {
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name");
		String firstName=sc.nextLine();
		
		System.out.println("Enter Last Name");
		String lastName=sc.nextLine();
		
		System.out.println("Enter Address");
		String address=sc.nextLine();
		
		System.out.println("Enter City");
		String city=sc.nextLine();
		
		System.out.println("Enter zip code");
		String zipCode=sc.nextLine();
		
		System.out.println("Enter State");
		String state=sc.nextLine();
		
		System.out.println("Enter the email");
		String email=sc.nextLine();
		
	    info.add(firstName);
		info.add(lastName);
		info.add(address);
		info.add(city);
		info.add(zipCode);
		info.add(state);
		info.add(email); 
		
		return info;
		
	}
	
}


public class AddressBookk {
	
	public static void main(String[] args) {

		System.out.println("Welcome to Address Book");
		
		Info in1 = new Info();
		in1.addressInfo();

		
	}

}
