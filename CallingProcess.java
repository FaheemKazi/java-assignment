package firstjavaproject;

public class CallingProcess {

	public static void main(String[] args) {

		int a = 3;
		int b = 3;

		Process obj1 = new Process();
		int[] array = obj1.xyz(a, b);
		System.out.println();
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
	}
}

//Scanner scan = new Scanner(System.in);

//System.out.println(" Enter first no :..\n");
//
//System.out.println("enter second no....\n");
// a = Scan.nextInt();
//b = Scan.nextInt();

// int a  = obj1.Calc(a);
// int b  = obj1.Calc(b);
