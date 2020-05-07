package BasicJavaPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		// To check PalindromeNumber
		
		int num = 12333221;
		
		int temp = num;
		int rev = 0;
		
		int rem = 0;
		
		while(num>0)
		{
			rem = num%10;
			rev = rev *10 + rem;
			num = num/10;
		}
		
		if(rev == temp)
		{
			System.out.println("Number is Palindrome");
		}
		
		else {
			
			System.out.println("Number is not Palindrome");
		}

	}

}
