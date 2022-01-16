package phase1.assisted_practice.classes_objects_oops;

class Animal
{  
	public void eat()
	{
		  System.out.println("eatinAny doubtg...");
    }  
}  


class Dog1 extends Animal
{  
	void bark()
	{
		System.out.println("barking...");
	}  
}  
	

class BabyDog extends Dog1
{  
	void weep()
	{
		System.out.println("weeping...");
	}  
}  


public class MultiLevel_Inheritance{  
	public static void main(String args[]){  
	
	BabyDog d=new BabyDog();  
	
	d.weep();  
	d.bark();  
	d.eat();  
		
    }
}