package javaAssignment;

import java.util.Scanner;

//Write a Java program that takes a year from user and print whether that year is a leap year or not.

public class Three_LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of year :");
		int y=sc.nextInt();
		
		String year=(y%4 == 0)? +y+" Is a leap Year": +y+" Is not a leap Year";
		System.out.println(year);
		
		sc.close();
	}
}
