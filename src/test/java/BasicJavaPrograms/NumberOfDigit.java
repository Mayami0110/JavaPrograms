package BasicJavaPrograms;

public class NumberOfDigit {

	public static void main(String[] args) {
		// Print Number of Digit in integer
		
		int num = 10;
		
		int count =0;
		
		while(num>0)
		{
			num = num/10;
			++count;
		}

		System.out.println(count);
	}

}
