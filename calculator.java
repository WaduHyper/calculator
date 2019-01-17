package calulator;

import java.util.Scanner;

public class Calculator {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String action = new String();
		int num1, num2;

		System.out.println("Enter the first number:");
		num1 = input.nextInt();
		System.out.println("What action to perform?:");
		action = input.next();
		System.out.println("Enter the second number:");
		num2 = input.nextInt();

		if (action.equals("+"))
			System.out.println("The result is: "+plus(num1, num2));
		else if (action.equals("-"))
			System.out.println("The result is: "+minus(num1, num2));
		else if (action.equals("*"))
			System.out.println("The result is: "+multiply(num1, num2));
		else if (action.equals("/"))
			System.out.println("The result is: "+devide(num1, num2));

	}

	public static int plus(int num1, int num2) {
		int result = (num1 + num2);
		return result
	}

	public static int minus(int num1, int num2) {
		int result = (num1 - num2);
		return result
	}

	public static int multiply(int num1, int num2) {
		int result = (num1 * num2);
		return result
	}

	public static int devide(int num1, int num2) {
		int result = (num1 / num2);
		return result
	}


}