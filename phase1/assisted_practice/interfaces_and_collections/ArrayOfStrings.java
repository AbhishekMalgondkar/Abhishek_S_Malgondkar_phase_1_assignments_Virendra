package phase1.assisted_practice.interfaces_and_collections;

import java.util.Arrays;
import java.util.List;

public class ArrayOfStrings {

	public static void main(String[] args) {
	    String[] words = new String[]{"C++", "Java", "C", "Python"};
	    
        List<String>wordslist = Arrays.asList(words);
        String check = "Java";
        if(wordslist.contains(check)){
           System.out.println("The word " + check + " present in string array");
        }
       else
       System.out.println("The word " + check + " not present in string array" );
	}

}
