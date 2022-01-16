package phase1.assisted_practice.interfaces_and_collections;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

	public static void main(String[] args) {
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("firstname@domain.com");  
        emails.add("virendra@domain.co.in");  
        emails.add("test123prepare@co.edu.com");
        
        
        String regex = "^(.+)@(.+)com"; 
       String regex1 = "//d[10]";
      
        Pattern pattern = Pattern.compile(regex);
        Pattern pattern1 = Pattern.compile(regex1);
   
        for(String email : emails){  

        	Matcher matcher = pattern.matcher(email);  
           
            System.out.println("Email Id : " + email +" is valid = "+ matcher.matches()+"\n" );  
        } 
        System.out.println( "Mobile no is vaild = " + pattern.matches("\\d{10}" , "9173936889")+"\n");  
        System.out.println( "Password is valid = " + pattern.matches("[SWA][a-z]+\\d{2}+[a-z0-9]+","Sbrahaspati231"));

	}

}
