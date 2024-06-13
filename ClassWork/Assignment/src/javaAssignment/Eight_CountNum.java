package javaAssignment;

import java.util.Scanner;

/* Write a Java program that reads a positive integer and count the number of digits the 
number.
Input an integer number less than ten billion: 125463 
Number of digits in the number: 6 */

public class Eight_CountNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int temp = 0;
		long num;
		
		System.out.print("Enter number:");
		num=sc.nextLong();
		
		while(num != 0) {
			temp++;
			num /= 10;
		}
		System.out.println("Number of digits in the number: "+ temp);
		sc.close();
	}
}