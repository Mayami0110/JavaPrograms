package BasicJavaPrograms;

public class NAturalNumerSum {

	public static void main(String[] args) {

		int num = 100;
		int sum = 0;
		int sum1 = 0;
		for(int i=1;i<=num;i++)
		{		sum= sum+i;
		}
		System.out.println(sum);
	


	while(num>=1)
	{
		sum1 = sum1+num;
		num--;
	}
	System.out.println(sum);

}
}