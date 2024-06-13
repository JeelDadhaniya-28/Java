package javaAssignment;

import java.util.Scanner;

/* Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel or Consonant, depending on the user input. If the user input
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message. */

public class Two_Vowel {
	public static void main(String[] args) {

		System.out.println();
		new Two_Vowel();

	}

	public Two_Vowel() {
		Scanner sc = new Scanner(System.in);
		char c;

		System.out.print("Enter your charactor:");
		c = sc.next().charAt(0);

		if (c >= 'A' && c <= 'z') {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				System.out.println("Charactor is Vowel");
			} else {
				System.out.println("Charactor is Consonant");
			}
		} else {
			System.out.println("Charactor not found");
		}
		sc.close();
	}

}
