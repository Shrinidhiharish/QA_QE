package java_SSessionOne;

import java.util.Scanner;

public class Customer {

	static String name;
	static int age;
	static String gender;
	static String city;
	public static void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		name=sc.nextLine();
		
		System.out.println("Enter age:");
		 age =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter gender:");
		 gender =sc.nextLine();
		 
		 System.out.println("Hailing from:");
		 city =sc.nextLine();
	}
	
	
	public static void displayCustomerData()
	{
		System.out.println("Welcome," +name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("City:"+city);
	}
public static void main(String[] args) {
	getData();
	displayCustomerData();
	
}
	


}
