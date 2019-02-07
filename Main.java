package secondproject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

			int a = 0, b =0, choice;
			Scanner scan = new Scanner(System.in);
			System.out.println("For ADD - Sub - Mul ....1");
			System.out.println("Tabels Two No...........2");
			choice  = scan.nextInt();
		
			if(choice > 2)
		    {
		    	System.out.println("Invalid Selection");		    	
		    }
		    else
		    {
		    System.out.println("Enter First Number.......");
		   	System.out.println("Enter second Number.......");
			a = scan.nextInt();
			b = scan.nextInt();
		    }
		    switch (choice) 
		    {
		    case  2:
		    
		   	table1 obj1 = new table1();
		   	int[] array1 = obj1.abc(a);
			System.out.println();
			System.out.println(a+ "x 1 =" +array1[0]);
			System.out.println(a+ "x 2 ="+array1[1]);
			System.out.println(a+"x 3 ="+array1[2]);
			System.out.println(a+"x 4 ="+array1[3]);
			System.out.println(a+"x 5 ="+array1[4]);
			System.out.println(a+"x 6 ="+array1[5]);
			
	    	table2 obj2 = new table2();
	    	int[] array2 = obj2.def(b);
	    	System.out.println();
	    	System.out.println(b+"x 1 =" +array2[0]);
	    	System.out.println(b+"x 2 =" +array2[1]);
	    	System.out.println(b+"x 3 =" +array2[2]);
	    	System.out.println(b+"x 4 =" +array2[3]);
	    	System.out.println(b+"x 5 =" +array2[4]);
	    	System.out.println(b+"x 6 =" +array2[5]);
		    break;
		    
		    case 1:
		    
	    	math obj3 = new math();
	    	int[] array3 = obj3.xyz(a, b);
	    	System.out.println();
	    	System.out.println(a+ "+" + b+"  = "+array3[0]);
	    	System.out.println(a+ "-"+b+"  = " +array3[1]);
	    	System.out.println(a+ "x"+b+"  = " +array3[2]);
	    	break;
		 	}	
		   
}
}
