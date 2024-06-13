package javaAssignment;

import java.util.Scanner;

//Write a Java program to count the letters, spaces, numbers and other characters of an input string.

public class Nine_CountLetter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String inp;
		int temp=0;
		
		System.out.print("Insert data:");
		inp=sc.nextLine();
		
		for(int i=inp.length(); i!=0; i--) {
			temp++;
		}
		
		System.out.println("Total count is:"+temp);
	
		sc.close();
	}
}
