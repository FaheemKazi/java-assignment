package passby;

public class passbyvalue {
	public static void main(String[] args) {
		
		int i,j,sum;
		i=10;
		j=10;
		System.out.println("value of i=" +i);
		System.out.println("value of j=" +j);
		sum=add(i,j);
		System.out.println("sum= " +sum);
		
}
  
	private static int add(int x, int y ) {
		x=20;
		System.out.println("value of x=" +x);
		y=21;
		System.out.println("value of y=" +y);
		return x+y;
		
		
	}
	
	
	
}
