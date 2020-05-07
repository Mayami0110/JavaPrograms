package BasicJavaPrograms;

public class PrimeNumOrNot {

	public static void main(String[] args) {

		// To check number is prime or not
		
		int num = 1;
		
		Boolean bool = false;
		
		if((num == 1) || (num ==0))
		{
			bool = true;
		}
		else {
		
		for(int i =2; i<num/2;i++) {
			
			if(num%i == 0)
			{
				bool = true;
				break;
			}
			
		}
		}
		if(!bool)
		{
			System.out.println("Num is Prime");
		}
		
	//	else if (num ==1)  System.out.println("Num is not Prime");
		
		else System.out.println("Num is not Prime");
				
	}

}
