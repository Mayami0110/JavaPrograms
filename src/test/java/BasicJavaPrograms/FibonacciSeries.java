package BasicJavaPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		int num = 10;
		
		int a=0;
		int b =1;
		int sum =0;
		
		/*System.out.print(a + " , " + b );
		
		for(int i=2; i<=num; i++)
		{
			sum = a+b;
			System.out.print(", "+ sum);
			a=b;
			b=sum;
		}*/
		
		for(int i=2; i<=num; i++)
		{
			System.out.print( a + " , ");
			sum = a+b;
			a=b;
			b=sum;
		}
		 
		
	}

}
