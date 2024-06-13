package tops.exception;

import java.util.Scanner;

public class ThrowDemo {
	
	public static void main(String[] args) {
		Demo();
	}
	
	public static void Demo() {
		int x;
		
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("Enter X:");
			x=sc.nextInt();
			
			if(x > 0) {
				System.out.println("Square of "+x+" Is : "+(x*x));
			}else {				
				throw new Exception();
			}
		}
		catch (Exception e) {
			System.out.println("Please Enter Positive Number Only.");
			Demo();
		}
	}
}
