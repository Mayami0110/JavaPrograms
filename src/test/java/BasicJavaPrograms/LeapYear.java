package BasicJavaPrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Eneter the Year : ");
		
		int year = reader.nextInt();
		
		boolean flag = false;
		
		if(year%4 == 0)
		{
			if(year%100 == 0)
		{
				if(year%400 == 0) {
					flag =true;
		}
				else 	
					flag =false;
					

		}
			flag =true;
			
		}
		flag =false;
		if (flag == true)
		{
			System.out.println(year +": year is leap year");
		}
		else
			System.out.println(year +": year is not leap year");
	}

}
