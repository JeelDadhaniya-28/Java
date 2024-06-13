package javaAssignment;

import java.util.Scanner;

/* Write a Java program that accepts an integer (n) and computes the value of 
n+nn+nnn. Input number: 5 */

public class Eleven_Comput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num,temp=0;
		
		System.out.print("Enter number here:");
		num=sc.nextInt();
		

		temp=num;
		for(int i=1; i<=3; i++) {
			if(i>1) {
				for(int j=1; j<2; j++) {
					temp=(temp*10)+temp;
					System.out.println(temp);
				}
			}
		}
		temp+=(num*2);
		System.out.println(num+"+"+num+num+"+"+num+num+num+"="+temp);
		
		sc.close();
	}
}