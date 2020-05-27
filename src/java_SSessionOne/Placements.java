package java_SSessionOne;

import java.util.Scanner;

public class Placements {

	static int CSE;
	static int ECE;
	static int MECH;

	public static void Data() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students placed in CSE");
		CSE = sc.nextInt();

		System.out.println("Enter the no of students placed in ECE");
		ECE = sc.nextInt();

		System.out.println("Enter the no of students placed in MECH");
		MECH = sc.nextInt();
		
		if((CSE==ECE)&&(ECE==MECH))
		{
			System.out.println("None of the department has got the highest placement.");
		}
		else if(CSE<0||ECE<0||MECH<0)
		{
			System.out.println("Input is invalid ");
		}
	else
		System.out.println("Highest placement");
	{
			if((CSE>=ECE)&&(CSE>=MECH))
			{
				if(CSE==ECE)
				{
					System.out.println("CSE"+"\n ECE");
				}
				
				else if(CSE==MECH) {
					System.out.println("CSE"+"\n MECH");	
				}
				else
					System.out.println("CSE");
			}
			
			else if (ECE>=MECH)
			{
				if(ECE==MECH)
				{
					System.out.println("ECE" + "\n MECH");
				}
				else 
				{
					System.out.println("ECE");
				}
			}
				else
				{
					System.out.println("MECH");
					System.out.println("highest placement\n\nCSE\n\nMECH");
				}
			}
	}
		


	public static void main(String[] args) {
		Data();
	}
}
