package multiplejavafiles;

import java.util.*;
import java.lang.*;

public class main {
	public static void main(String[] args) {
		int firstnum =Integer.parseInt(args[0]);
	   int secondnum =Integer.parseInt(args[1]);
		String operater=args[2];
		int output;
	 
	System.out.println("Enter two values");
	subclass result=new subclass();
	
	System.out.println("Enter operator");
	
	switch(operater) {
	  case "+":
	       output=result.add( firstnum, secondnum);
	      
	  break;
	  case "-":
	       output=result.sub(firstnum, secondnum);
	      
	  break;
	  case "*":
		   output=result.mul(firstnum, secondnum);
	     
	  break;
	  case "/":
		   output=result.div(firstnum, secondnum);
	     
	  break;
	  default:
		  System.out.println("Invalid Operation!!!");
		return;
	  
	
	}
	
	System.out.println("Result is:" + output);
}
	
	
}