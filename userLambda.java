package com.userRegx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class userLambda {
	
	private static final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String FIRST_NAME="[A-Z][a-z]*{3,}";
    private static final String Last_NAME="[A-Z][a-z]*{3,}";
    private static final String phoneNumber="^[1-9]{2}[0-9]{7,12}$";
    private static final String password="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";


@FunctionalInterface
interface IUserDetails{
	boolean regexCheck(String A,String B);
}


static IUserDetails First_Name =(FirstNameregex,input) ->{
	
	  Pattern pattern=Pattern.compile(FirstNameregex);
	  Matcher matcher=pattern.matcher(input);
	  return matcher.matches();	
};


public static void main(String[] args) {
System.out.println("FirstName is valid : "+First_Name.regexCheck(FIRST_NAME,"Abhishek"));
System.out.println("Email is valid : "+First_Name.regexCheck(EMAIL_REGEX,"abhishekkumar24717@gmail.com"));
System.out.println("LastName is valid : "+First_Name.regexCheck(Last_NAME,"Kumar"));
System.out.println("Phonenumber is valid : "+First_Name.regexCheck(phoneNumber,"919810175342"));
System.out.println("Password is valid : "+First_Name.regexCheck(password,"Abhishek@123"));
}
}
