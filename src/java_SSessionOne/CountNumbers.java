package java_SSessionOne;

import java.util.Scanner;

public class CountNumbers {

	static int n;
	static int d;
	static int c;

	public static void getdata() throws ArithmeticException {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		d=sc.nextInt();
			if (n % 10 == d)
				c++;
			n = n / 10;
			System.out.println("Count of "+d+" in "+n+" is "+c);
		}
		
	
	

	public static void main(String[] args) {
		getdata();
	}
}
