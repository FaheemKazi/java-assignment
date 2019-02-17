package secondproject;

public class Errorhandling {
public static void main(String[] args) 
{
	 try {
		 int a,b,c;
		 a=Integer.parseInt(args[0]);
		 b=Integer.parseInt(args[1]);
         c=a/b;    			 
			 
          // if value will be zero cannot divide by zero 
         System.out.println ("Result = " + c); 
     } 
     catch(ArithmeticException e) { 
         System.out.println ("Can't divide a number by 0"); 
     } 
 } 
} 