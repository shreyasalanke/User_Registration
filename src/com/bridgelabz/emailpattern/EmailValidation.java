package com.bridgelabz.emailpattern;

import java.util.ArrayList;
import java.util.regex.*;

public class EmailValidation {
	public static void main(String[] args) {
	 ArrayList<String> emailsample = new ArrayList<>();

	 emailsample.add("abc@yahoo.com");
	 emailsample.add("abc-100@yahoo.com");
	 emailsample.add("abc.100@yahoo.com");
	 emailsample.add("abc111@abc.com");
	 emailsample.add("abc-100@abc.net");
	 emailsample.add("abc.100@abc.com.au");
	 emailsample.add("abc@1.com");
	 emailsample.add("abc@gmail.com.com");
	 emailsample.add("abc+100@gmail.com");

	 emailsample.add("abc");
	 emailsample.add("abc@.com.my");
	 emailsample.add("abc123@gmail.a");
	 emailsample.add("abc123@.com");
	 emailsample.add(".abc@abc.com");
	 emailsample.add("abc()*@gmail.com");
	 emailsample.add("abc@%*.com");
	 emailsample.add("abc..2002@gmail.com");
	 emailsample.add("abc.@gmail.com");
	 emailsample.add("abc@abc@gnail.com");
	 emailsample.add("abc@gmail.com.1a");
	 emailsample.add("abc@gmail.com.aa.au");

     int number = 1;
     for(String email : emailsample)
     {
         boolean emailMatcher = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$").matcher(email).matches();
         System.out.println(number++ + "." + email +":" + emailMatcher);
     }
 }
}