package BasicJavaPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// to check the armstrong number
		
		int num = 122;
		int actNum = num;
		int cube = 0;
		
		while(num>0)
		{
			int rem = num%10;
			cube = cube + (rem*rem*rem);
			num = num/10;
			
		}
		
		if(cube == actNum)
		{
			System.out.println(actNum + "  number is  armstrong number");
		}
		
		else 			System.out.println(actNum + "  number is not armstrong number");

	}

}
