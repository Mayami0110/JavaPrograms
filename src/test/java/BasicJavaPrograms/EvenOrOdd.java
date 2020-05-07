package BasicJavaPrograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int num = reader.nextInt();
		
		int reminder = num%2;
		
		if(reminder == 0) {
			
			System.out.println(num +": Number is Even");
			
		}
		else {
			System.out.println(num + ":Num is odd");
		}
		
	}

}
