package java_SSessionOne;

import java.util.Scanner;

public class Triangle {
	static int side1;
	static int side2;
	static int side3;
	public static void getsides()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st side");
		side1 = sc.nextInt();
		
		if(side1==0)
		{
			System.out.println(side1+"is an Invalid Length");
			Runtime.getRuntime().exit(0);
		}
		System.out.println("Enter the 2nd side");
		side2 = sc.nextInt();
		 if(side2==0)
			{
				System.out.println(side2+"is an Invalid Length");
			
			}
		
		System.out.println("Enter the 3rd side");
		side3 = sc.nextInt();
		 if(side3==0)
		{
			System.out.println(side3+"is an Invalid Length");
			
			
		}
}

		public static  void compare()
		{
			
		 if(side1==side2 && side1==side3)
		{
				System.out.println(side1+","+side2+","+side3+"are the sides of Equilateral Triangle");
			
		}
		else if((side1 == side2) & (side2 != side3) || (side2 == side3) & (side3!= side1))
		{
			System.out.println(side1+","+side2+","+side3+"are the sides of Isosceles Triangle");
		}
		else if((side1 != side2) & (side2 != side3))
		{
			System.out.println(side1+","+side2+","+side3+"are the sides of Scalene Triangle");
		}
	}
	
	
	
public static void main(String[] args) {
	getsides();
	
		compare();
	
	
}
}
