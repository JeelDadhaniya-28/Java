package tops.exception;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Start");
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("Enter A:");
			a=sc.nextInt();
			
			System.out.print("Enter B:");
			b=sc.nextInt();
			
			c=a/b;
			System.out.println("C="+c);
		}
		catch(Exception e) {
			System.out.println("Exception Caught");
		}
//		catch(ArithmeticException e) {
//			System.out.println("Exception Caught" +e);
//		}
//		catch(InputMismatchException e) {
//			System.out.println("Exception Caught" +e);
//		}
		
		sc.close();
		System.out.println("End");
	}
}
