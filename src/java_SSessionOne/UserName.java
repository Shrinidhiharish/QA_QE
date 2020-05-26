package java_SSessionOne;

import java.util.Scanner;

public class UserName {

	static String name;
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		name=sc.nextLine();
		System.out.println("Welcome " +name);
}
}
