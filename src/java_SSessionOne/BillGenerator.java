package java_SSessionOne;

import java.util.Scanner;

public class BillGenerator {

//		Total price
//		1290
//		ENJOY THE SHOW!!!
	static int pizzano;
	static int puffno;
	static int drinks;
	public static void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of pizzas bought");
		pizzano=sc.nextInt();
		
		System.out.println("Enter the no of puffs bought");
		puffno =sc.nextInt();
		
		System.out.println("Enter the no of cool drinks bought");
		 drinks =sc.nextInt();
		 
	}
	
	
	public static void displayCustomerData()
	{
		System.out.println("Bill Details");
		System.out.println("No of pizzas");
		System.out.println(pizzano);
		System.out.println("No of puffs");
		System.out.println(puffno);
		System.out.println("No of cool drinks");
		System.out.println(drinks);
		int total = pizzano+puffno+drinks;
		System.out.println("Total price");
		System.out.println(total);
		System.out.println("ENJOY THE SHOW!!!");
	}
	
	public static void main(String[] args) {
		getData();
		displayCustomerData();
	}
	
}
