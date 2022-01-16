package jav.phase1.practice_project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteAppend {

	public static void main(String[] args) {

		System.out.println(" 1 : Read \n 2 : Write \n 3 : Append");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Choice");
		int choice = sc.nextInt();
		
		Operations op = new Operations();
		
		switch (choice)
		{
		case 1 : op.readFile();
		break;
		
		case 2 : op.writeFile();
		break;
		
		case 3 : op.appendFile();
		break;
		
		default : System.out.println("Invalid Choice");
		}

	}

}

class Operations{

	public void writeFile() {
	
		String data = "This is the data in the output file";
		    
		    try {
		      FileWriter output = new FileWriter("D://phase1.txt");

		      
		      output.write(data);
		      System.out.println("Data is written to the file.");

		      output.close();
		    }
		    catch (Exception e) {
		      e.getStackTrace();
		    }		
	}

	public void readFile() {
		
	    char[] array = new char[60];

		
		 try {
		      FileReader input = new FileReader("D://phase1.txt");

		      input.read(array);
		      
		      System.out.println("Data in the file:");
		      System.out.println(array);

		      input.close();
		    }
		    catch(Exception e) {
		      e.getStackTrace();
		    }		
	}
	
	 public void appendFile() {
		 try {
	         String data = " Hi, How are you.";
	         File f1 = new File("D://phase1.txt");
	         if(!f1.exists()) {
	            f1.createNewFile();
	         }

	         FileWriter fileWritter = new FileWriter(f1.getName(),true);
	         BufferedWriter bw = new BufferedWriter(fileWritter);
	         bw.write(data);
	         bw.close();
	         System.out.println("Done");
	      } 
	      
	      catch(IOException e){
	         e.printStackTrace();
	      }
	 }
}

