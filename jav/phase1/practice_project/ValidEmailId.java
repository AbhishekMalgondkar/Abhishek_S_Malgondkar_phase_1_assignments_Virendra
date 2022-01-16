package jav.phase1.practice_project;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmailId {

	public static void main(String[] args) {

		ArrayList<String> emails = new ArrayList<String>();  
	        emails.add("firstname@domain.com");  
	        emails.add("virendra@domain.co.in");  
	        emails.add("test123prepare@co.edu.com");
	        
	        
	        String regex = "^(.+)@(.+)com"; 
	      
	        Pattern pattern = Pattern.compile(regex);
	   
	        for(String email : emails){  

	        	Matcher matcher = pattern.matcher(email);  
	           
	            System.out.println("Email Id : " + email +" is valid = "+ matcher.matches()+"\n" );  
	        } 

	}

}
