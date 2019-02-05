
package arthematicoperations;

public class arthematic {

	public static void main(String[] args) {
		int firstnum;
		int secondnum;
		int result;
		firstnum = Integer.parseInt(args[0]);
		secondnum = Integer.parseInt(args[1]);
		System.out.println("Enter two numbers");

		String operator = args[2];
		System.out.println("Enter an operator:");

		switch (operator) {
		case "+":
			result=firstnum +  secondnum ;
			break;
		case "-":
			result =  firstnum - secondnum ;
			break;
		case "*":
			result = firstnum * secondnum;
			break;
		default:
			System.out.println("Invalid Operation!!!");
			return;

		}

		System.out.println("Result is:" + result);

	}

}
