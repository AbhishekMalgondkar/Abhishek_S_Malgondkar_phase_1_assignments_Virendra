package phase1.assisted_practice.classes_objects_oops;

class Animal1{  
	void eat()
	{
		System.out.println("eating...");
	}  
}  

class Dog extends Animal1{  
	
	void bark()
	{
		System.out.println("barking...");
	}  
}  

class Cat extends Animal1{  
	
	void meow()
	{
		System.out.println("meowing...");
	}  
}  
	
	
public class Hierarchical_Inheritance{  
	public static void main(String args[]){  
	
	Dog d = new Dog();
	Cat c=new Cat();  
	c.meow();  
	c.eat(); 
	d.bark();
	d.eat();
}}  