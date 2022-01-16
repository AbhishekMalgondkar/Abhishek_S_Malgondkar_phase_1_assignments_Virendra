package phase1.assisted_practice.classes_objects_oops;

abstract class Bike {
	Bike() {
		System.out.println("bike is created");
	}

	abstract void run1(); // abstract method()

	void changeGear() // non-abstract method()
	{
		System.out.println("gear changed");
	}
}

abstract class Honda extends Bike {
	
	Honda(){
		System.out.println("honda is created");
	}
	// changeGear(), run1()	
	abstract void run();
	
	abstract void run1();
}
	

class Hello extends Honda {
	void run() {
		System.out.println("running safely..");
	}

	@Override
	void run1() {
		
		System.out.println("inside the run1 method");
	}	
}


public class AbstractEg {
	public static void main(String args[]) {

		Honda k = new Hello(); 

		k.run();
		k.run1();
		k.changeGear();
		
	}
}
