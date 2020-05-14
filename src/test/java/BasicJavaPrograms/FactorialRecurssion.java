package BasicJavaPrograms;

public class FactorialRecurssion {

	public static void main(String[] args) {
		//Java Program to Find Factorial of a Number Using Recursion
	
	
	int fact = 5;
	
	System.out.println("Factorial of Num = " + factNum(fact));
	
	
	}

	
	
	
	 public static int factNum(int num)
	 {
		 if(num >1)
		 return num * factNum(num-1);
		 else 
			 return 1;
	 }
}
