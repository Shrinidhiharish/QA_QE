package java_SSessionOne;

import java.util.Scanner;

public class CarDetails {
	static String name;
	static int carNumber;
	static double price;
	public static void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car name:");
		name=sc.nextLine();
		
		System.out.println("Enter the car no:");
		 carNumber =sc.nextInt();
		
		System.out.println("Enter the price:");
		 price =sc.nextDouble();
	}
	public static void displaydetails()
	{
		System.out.println("Car name:" +name);
		System.out.println("Car no:"+carNumber);
		System.out.println("Price:" +String.format("%.2f", price)+" rs only");
	}
	
	public static void main(String[] args) {
		getdata();
		displaydetails();
	}

}
