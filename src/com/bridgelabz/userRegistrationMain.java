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
	}

}
