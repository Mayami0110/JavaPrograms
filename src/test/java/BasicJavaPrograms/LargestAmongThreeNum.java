package BasicJavaPrograms;

public class LargestAmongThreeNum {

	public static void main(String[] args) {
	
		//find out largest among 3 num
		
		int x =100;
		int y = 200;
		int z = 300;
		
		if(x>y && x>z)
		{
			System.out.println(x +": is the greater number");
			
		}
		if(y>z)
		{
			System.out.println(y +": is the greater number");

		}
		
		else 
			System.out.println(z +": is the greater number");


	}

}
