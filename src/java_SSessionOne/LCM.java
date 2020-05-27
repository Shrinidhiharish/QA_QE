package java_SSessionOne;

import java.util.Scanner;

public class LCM {
	static int sam;
	static int riya;
	static int max;
	static int lcm;
	static int step;
	public static void getdata() throws ArithmeticException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day interval of Sam:");
		sam=sc.nextInt();
		System.out.println("Enter the day interval of Riya:");
		riya=sc.nextInt();
		
		
		if(sam<=0||riya<=0)
		{
			System.out.println(sam+" to "+riya+" is not a valid interval");
		}
		else
		{
		
			 if( sam > riya){
		         max = step = sam;
		      }
		      else{
		         max = step = riya;
		      }

		      while(sam!= 0) {
		         if(max % sam == 0 && max % riya == 0) {
		            lcm = max;
		            break;
		         }
		         max += step;
		      }
		      System.out.println("Sam and Riya will have their dinner on day"+lcm );
		   
	
		}
	}
public static void main(String[] args) {
	getdata();
}
}
