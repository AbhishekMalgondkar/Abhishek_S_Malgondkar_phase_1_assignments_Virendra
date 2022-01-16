package phase1.assisted_practice.interfaces_and_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionEg {

	public static void main(String[] args) {

		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Belgaum");//
	      city.add("Dharwad");    	   
	      System.out.println(city);  
		
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(45); 
	      vec.addElement(30); 
	      System.out.println(vec);
		
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Abhishek");  
	      names.add("Vinayak");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(21);  
	       set.add(22);  
	       set.add(23);
	       set.add(24);
	       System.out.println(set);
	       
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(1);  
	       set2.add(2);  
	       set2.add(3);
	       set2.add(4);	       
	       System.out.println(set2);
	      	} 

	}

}
