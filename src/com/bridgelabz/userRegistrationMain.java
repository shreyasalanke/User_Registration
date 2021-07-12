package com.bridgelabz;

import java.util.Scanner;

public class userRegistrationMain 
{
	public static void main(String[] args) 
	{
		userRegistration userRegistrationService = new userRegistrationImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The First Name :");
		System.out.println(userRegistrationService.firstNameinfo(scanner.next()));
		System.out.println("Enter The Last Name :");
		System.out.println(userRegistrationService.lastNameinfo(scanner.next()));
		System.out.println("Enter The Emailid :");
		System.out.println(userRegistrationService.emailinfo(scanner.next()));
		System.out.println("Enter The Phone Number :");
		System.out.println(userRegistrationService.phoneNumberinfo(scanner.next()));
	}
}
