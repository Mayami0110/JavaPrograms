package BasicJavaPrograms;

public class PrimeNoInInterval {

	public static void main(String[] args) {
		// To find all prime no between two number.
		try {
		int lownum = 20;
		int highnum = 50;
		
		while(lownum <highnum)
		{
			boolean flag = false;
			for(int i =2; i<lownum/2;i++)
				
			{
				
				if(lownum % i ==0)
				{
					flag = true;
					break;
				}
			}
			if(!flag)	System.out.println(lownum + " ");
			
			lownum++;
		}
	

	}
	catch(Exception e)
	{
		System.out.println(e);
	}

}
}