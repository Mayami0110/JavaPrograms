package BasicJavaPrograms;

import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		//Vowel - A E I O U

	
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a Char : ");

		char ch = reader.next().charAt(0);
		
		if(ch == 'a' || ch=='e' || ch=='i' || ch == 'o' || ch== 'u')
		{
			System.out.println(ch + ": Char entered is Vowel");
		}
		
		else
			System.out.println(ch + ": Char entered is Consonent");

	}

}
