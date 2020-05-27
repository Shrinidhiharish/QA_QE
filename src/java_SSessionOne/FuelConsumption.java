package java_SSessionOne;

import java.util.Scanner;

public class FuelConsumption {
	
	static double lit;
	static double dis;
	static double lperkm;
	static double gallon;
	static double miles;
	static double galpermi;
	public static void getdata() throws ArithmeticException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of liters to fill the tank");
		lit=sc.nextDouble();
		if((lit<=0))
			
		{
			
			System.out.println(lit+"is an Invalid Input");
		}
		
		else {
			
			System.out.println("Enter the distance covered");
			dis=sc.nextDouble();
			
			if(dis<=0)
			{
				System.out.println(dis+"is an Invalid Input");
			
			}
			else {
			System.out.println("Liters/100KM");

			    try {
			         lperkm=(lit/dis)*100;
			       
			    }
			    
			    catch (ArithmeticException e) {
			        throw new  ArithmeticException("Error: Don't divide a number by zero");
			    }
			
			    System.out.println(String.format("%.2f",lperkm));
			    
			    System.out.println("Miles/gallons");
			    gallon=(lit*0.2642);
			    miles=(dis*0.6214);
			    galpermi=miles/gallon;
			    
			    System.out.println(String.format("%.2f",galpermi));
			
		}
		
	}
	
	}

	
public static void main(String[] args) {
	getdata();
}
	
}
