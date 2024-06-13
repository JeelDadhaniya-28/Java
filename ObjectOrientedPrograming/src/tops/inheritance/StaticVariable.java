package tops.inheritance;

import java.util.Scanner;

public class StaticVariable {
	
	static int a;
	void SetValue() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A:");
		a=sc.nextInt();
	
	}
	
	void PrintValue() {
		System.out.println("A = "+a);
	}

	public static void main(String[] args) {
		StaticVariable s1=new StaticVariable();
		StaticVariable s2=new StaticVariable();
		StaticVariable s3=new StaticVariable();
		
		s1.SetValue();
		s2.SetValue();
		s3.SetValue();
		
		s1.PrintValue();
		s2.PrintValue();
		s3.PrintValue();
	}

}
