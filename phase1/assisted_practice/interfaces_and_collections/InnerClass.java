package phase1.assisted_practice.interfaces_and_collections;

public class InnerClass {

		private int data=30;  
		
		void display(){
			System.out.println("i am inside the outer class method");
		}
		 
		class Inner{  		
		 private int data=20;
		  
		  void msg()
		  {
			  System.out.println("data is "+data);
		  }  
		  
		  void display(){
			  System.out.println("i am inside the inner class method");
		 }  
		  
		}
		
		
		 class Inner2{  		
			  
			  void msg2()
			  {
				  System.out.println("data is "+data);
			  }  
			  
			  void display2(){
				  System.out.println("i am inside the inner2 class method");
			 }  
			  
		 }
		
		public static void main(String args[]){  
		  
		  InnerClass obj=new InnerClass();    
		  InnerClass.Inner in=obj.new Inner();
		  InnerClass.Inner2 inn=obj.new Inner2();
		  inn.msg2();  
		  inn.display2(); 
		  in.display();
		  in.msg();
		  obj.display();
		 }

}
