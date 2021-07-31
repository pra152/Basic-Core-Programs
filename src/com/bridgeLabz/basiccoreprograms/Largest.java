package com.bridgeLabz.basiccoreprograms;
import java.util.Scanner;
public class Largest {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Three Numbers:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if (n1 >= n2 && n1 >= n3)
			System.out.println(n1 + " is the largest number.");
		else if (n2 >= n1 && n2 >= n3)
			System.out.println(n2 + " is the largest number.");
		else
			System.out.println(n3 + " is the largest number.");
	}

}
