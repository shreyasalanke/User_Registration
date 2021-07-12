package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistrationImpl implements userRegistration
{
	@Override
	public boolean firstNameinfo(String firstName)
	{
		String firstNameinfo = "^[A-Z]{1}[a-z]{3,20}$";
		Pattern pattern = Pattern.compile(firstNameinfo);
		Matcher matched = pattern.matcher(firstName);
		return matched.matches();
	}
	@Override
	public boolean lastNameinfo(String lastName) {
		String lastNameinfo = "^[A-Z]{1}[a-z]{3,20}$";
		Pattern pattern = Pattern.compile(lastNameinfo);
		Matcher matched = pattern.matcher(lastName);
		return matched.matches();
	}
	@Override
	public boolean emailinfo(String email) 
	{
		String emailinfo = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(emailinfo);
		Matcher matched = pattern.matcher(email);
		return matched.matches();
	}
	@Override
	public boolean phoneNumberinfo(String phoneNumber) 
	{
		String phoneNumberinfo = "^(91){1}[0-9]{9}$";
		Pattern pattern = Pattern.compile(phoneNumberinfo);
		Matcher matched = pattern.matcher(phoneNumber);
		return matched.matches();
	}
	@Override
	public boolean passwordinfo(String password) {
		String passwordinfo = "(?=.*?[A-Z])(?=.*?[0-9]).{8,}";
		Pattern pattern = Pattern.compile(passwordinfo);
		Matcher matched = pattern.matcher(password);
		return matched.matches();
	}

}