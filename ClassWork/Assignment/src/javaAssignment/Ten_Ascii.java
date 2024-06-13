package javaAssignment;

import java.util.Scanner;

//Write a Java program to print the ASCII value of a given character

public class Ten_Ascii {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char c;
		
		System.out.print("Enter Character you giv ASCII value:");
		c=sc.next().charAt(0);
		
		System.out.println("ASCII value is:"+(int)c);
		
		sc.close();
	}
}
