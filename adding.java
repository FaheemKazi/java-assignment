package addition;


public class adding {
public static void main(String[] args) {
	
int i,j,result;

i = Integer.parseInt(args[0]);
j = Integer.parseInt(args[1]);
	System.out.println("Enter number i:");

	System.out.println("Enter number j:");

   
	  result=i+j;
	if(i<=0 || j<=0 ){
		System.out.println("i or j less than or equal to zero\n");
	}
	else{
		System.out.println("sum of two numbers" +result);
	    }
	
}
}
