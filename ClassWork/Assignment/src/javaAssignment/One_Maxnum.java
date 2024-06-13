package javaAssignment;

import java.util.Scanner;

//Write a Java program to Take three numbers from the user and print the greatest number

public class One_Maxnum {

	public static void main(String[] args) {
		System.out.println();
		new One_Maxnum();
	}
	
	public One_Maxnum() {
		
		Scanner sc=new Scanner(System.in);
		
		int num[]=new int[3];
		int temp=0;
		
		for(int i=0; i<3; i++) {
			System.out.print("Enter "+ (i+1) +" :");
			num[i]=sc.nextInt();
			
			if(num[i] > temp) {
				temp = num[i];
			}
		}
		System.out.println("Greatest number is :"+temp);
		sc.close();
	}

}
