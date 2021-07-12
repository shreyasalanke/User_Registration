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

}