package tops.inheritance;

import java.util.Scanner;

public class StaticMethod {
	
//	Static variable
	static int a;
	
//	Static method -Call 4 (Call, when call method without object)
	static void SetValue() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A:");
		a=sc.nextInt();	
		sc.close();
	}
	
//	Static block -Call 1 (Call Any time)
	static {
		System.out.println("Static block Call.");
	}
	
//	Normal block -Call 2 (Call when create a object)
	{
		System.out.println("Block of 1 Call.");
	}
	
//	Static method -Call 4 (Call, when call method without object)
	static void PrintValue() {
		System.out.println("A = "+a);
	}
	
//	Constructor Call. -Call 3 (Call when create a object)
	public StaticMethod() {
		System.out.println("Constructor Call.");
	}
	
//	Normal block -Call 2 (Call when create a object)
	{
		System.out.println("Block of 2 Call.");
	}
	
	

	public static void main(String[] args) {
		new StaticMethod(); 
		
		SetValue();
		PrintValue();
	}
}
