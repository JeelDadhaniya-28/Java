package javaAssignment;

import java.util.Scanner;

public class Fourteen_index {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="Tops Technologies!";
		
		int i; 
		
		System.out.print("Input number:");
		i=sc.nextInt();
		if(s.length() < i)
		{
			System.out.println("please enter valid index");
		}
		else
		{
			System.out.println(s.charAt(i-1));	
		}
		sc.close();
	}

}
