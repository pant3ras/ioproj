//A simple I/O demonstration
//By Liviu Chile
//2019-03

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	//  public static void writeFile()
	  {
	      //set up for the user input
	      Reader r = new InputStreamReader(System.in);
	      BufferedReader br = new BufferedReader(r);
	      String str = null;
	      //Scanner scan = new Scanner (System.in);

	      try {
	              //prompt the user to input data
	    	  	System.out.print("Type your name: ");
	              
	             // String user_name = scan.nextLine();
	              
	              //System.out.print("Type your age: ");
	              
	              PrintWriter writer = new PrintWriter("IO_Test.txt", "UTF-8");
	              
	              while((str  = br.readLine())!=null)
	              { 
	              //save the line 
  // for the first commitsa
	            	  
	              writer.println(str);
	              }
	              writer.close();

	      } catch (IOException e) {
	          e.printStackTrace();
	      }
	  }
	
}
