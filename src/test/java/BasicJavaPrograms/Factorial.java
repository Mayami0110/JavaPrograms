package BasicJavaPrograms;

public class Factorial {

	public static void main(String[] args) {
		
		// to find out factorial of any num
		
		int num = 5;
		
		int fact = 1;
		
		for(int i=num;i>=1;i--)
		{
			fact = fact*i;
		}
		System.out.println("fact is"+ fact);
		
		
		/*while(num<=1)
		{
			fact = fact * num;
		}
		System.out.println("fact is"+ fact);*/
	}

}
