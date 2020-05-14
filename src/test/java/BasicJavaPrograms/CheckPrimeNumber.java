package BasicJavaPrograms;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// Java Program to Check Whether a Number can be Expressed as Sum of Two Prime
		// Numbers
		
		int num = 34;
		
		boolean flag = false;
		
	//	System.out.println(checkPrimeNumbers(17));
		
		for(int i = 2; i<= num/2; i++)
		{
			if(checkPrimeNumbers(i))
			{
				if(checkPrimeNumbers(num-i))
				{
					System.out.println(num + " = " + i+ " + " +(num - i));
					flag = true;
				}
			}
		}
		
		if(!flag)
		{
			System.out.println(num + "num cannot be Expressed as Sum of Two Prime number");
		}
		

	}

	public static boolean checkPrimeNumbers(int num) {
		boolean isPrime = true;

		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;

	}

}
