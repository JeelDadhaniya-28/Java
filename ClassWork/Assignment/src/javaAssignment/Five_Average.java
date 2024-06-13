package javaAssignment;

import java.util.Scanner;

/* Write a program in Java to input 5 numbers from keyboard and find their sum and 
average using for loop. */

public class Five_Average {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int avg,temp=0;
		
		for(int i=0; i<5; i++) {
			System.out.print("Enter "+(i+1)+" number:");
			avg=sc.nextInt();
			
			temp+=avg;
		}
		
		System.out.println("Average number is:"+(temp/=5));
		sc.close();
	}
}
