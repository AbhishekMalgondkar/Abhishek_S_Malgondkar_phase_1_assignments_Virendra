package phase1.assisted_practice.classes_objects_oops;

class Employee{  
	 float salary=40000;  
	 int bonus= 5600;
	 
	 public void show(){
		 System.out.println("inside the parent classs");
	 } 
}  

public class SingleInheritance extends Employee{  
	
	 int bonus=10000; 
	 
	 public void show(){
		 System.out.println("Bonus of Employee is:"+super.bonus);
		 System.out.println("inside the child classs");
	 }
	 
	 public static void main(String args[])
	 {  
	   SingleInheritance p=new SingleInheritance();  
	   
	   System.out.println("Programmer salary is:"+p.salary);    
	   System.out.println("Bonus of Programmer is: is:"+p.bonus); 
	   p.show();
	}  
	 
}  
