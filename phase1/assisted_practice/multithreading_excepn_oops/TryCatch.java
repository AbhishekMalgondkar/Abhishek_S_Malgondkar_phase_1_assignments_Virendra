package phase1.assisted_practice.multithreading_excepn_oops;

public class TryCatch {

	public static void main(String[] args) {
	   	
    	try {
        	int a=2/0;  
        } 
    	catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurs");
        } 
    	finally {
            System.out.println("Finally Done" + "\n");
        }
    	
    	try{    
            int a[]=new int[5];     
            a[6]=9;                                                        
           }    
    	catch(ArrayIndexOutOfBoundsException e)  
        {  
         System.out.println("ArrayIndexOutOfBoundsException occurs");  
        } 
    	finally {
            System.out.println("Finally Done");
        }
        
	}

}
