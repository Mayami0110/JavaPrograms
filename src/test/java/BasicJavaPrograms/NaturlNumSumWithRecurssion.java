
package BasicJavaPrograms;

public class NaturlNumSumWithRecurssion {

	public static void main(String[] args) {
		
		//Java Program to Find the Sum of Natural Numbers using Recursion

		
		int sum = 20;
		
		System.out.println("Sum of Number = " + addnum(sum));
		
		
		
		
		
	}

	public static int addnum(int num)
	{

		if(num!=0)
		{
			return num + addnum(num-1);
		}
		else {
		return num;
		}
	}

}
