package tops.exception;

import java.util.Scanner;

public class ThrowsDemo {
	
	public static void main(String[] args) {
		try {
			Demo();
		}catch (Exception e){
			System.out.println("Exception Caught.");
		}
	}
	
	public static void Demo() throws Exception {
		int x;
		
		Scanner sc=new Scanner(System.in);
		
	
		System.out.print("Enter X:");
		x=sc.nextInt();
		
		if(x > 0) {
			System.out.println("Square of "+x+" Is : "+(x*x));
		}else {				
			throw new Exception();
		}		
	}
}
