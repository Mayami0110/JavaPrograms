package BasicJavaPrograms;

public class FactorsOfNum {

	public static void main(String[] args) {


		// to find out factors of any number - num is divisble by how many numbers
		
		// like 60 - 1,2,3,4,5,6,10,12,15,20,30,60
		
		int num = 60;
		
		for(int i=1;i<=num;i++)
			
			if(num%i == 0)
			{
				System.out.println(i);
			}
		
		
	}

}
