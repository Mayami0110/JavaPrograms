package BasicJavaPrograms;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// Design a Calculator with switch case

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the two number : ");

		double firstnum = scr.nextDouble();
		double secondnum = scr.nextDouble();

		System.out.println("Enter the Operator :(+ , - , * , /): ");

		char operation = scr.next().charAt(0);
		double result = 0;
		

		switch (operation) {
		case '+':
			result = firstnum+secondnum;
			break;
		case '-':

			result = firstnum-secondnum;
			break;
		case '*':
			result = firstnum*secondnum;
			break;
		case '/':

			result = firstnum/secondnum;
			break;

		default:
			System.out.println("Enter correct command");
			break;
		}
		System.out.println(result);
	}

}
