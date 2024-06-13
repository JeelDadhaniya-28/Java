package javaAssignment;

//W.A.J.P to concatenate a given string to the end of another string

public class Fifteen_Concatenate {
	public static void main(String[] args) {
		String s1="Hello world!";
		String s2=" My name is Jeel.";
		
//		Normal concatenation 
		String s=s1+s2;
		
//		With concatenation method
		String sc=s1.concat(s2);
		
		System.out.println(s);
		System.out.println(sc);
	}
}
