package phase1.assisted_practice.multithreading_excepn_oops;

public class ExcpnHandling extends Exception{
	   String str1;
	   ExcpnHandling(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	   public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new ExcpnHandling("This is My error Message");
		}
		catch(ExcpnHandling exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   
	}
	   
}

