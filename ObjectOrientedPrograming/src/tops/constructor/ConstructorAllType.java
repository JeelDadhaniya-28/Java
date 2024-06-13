package tops.constructor;

import java.util.Scanner;

public class ConstructorAllType {
	
	int a,b,c;
	
	ConstructorAllType() {
		System.out.println("Defaunt Const Call.");
		a=6;
		b=7;
		c=8;
	}
	
	ConstructorAllType(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	ConstructorAllType(ConstructorAllType all){
		a=all.a;
		b=all.b;
		c=all.c;
	}
	
	void sum() {
		System.out.println("Sum of all is:"+ (a+b+c));
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		
		ConstructorAllType c1=new ConstructorAllType();
		c1.sum();
		System.out.println();
		
		
		System.out.print("Enter 1num:");
		a=sc.nextInt();
		
		System.out.print("Enter 2num:");
		b=sc.nextInt();
		
		System.out.print("Enter 3num:");
		c=sc.nextInt();		
		
		
		ConstructorAllType c2=new ConstructorAllType(a,b,c);
		c2.sum();
		System.out.println();
		
		System.out.println("Copy Const Call.");
		ConstructorAllType c3=new ConstructorAllType(c2);
		c3.sum();
		
		sc.close();
	}
}
