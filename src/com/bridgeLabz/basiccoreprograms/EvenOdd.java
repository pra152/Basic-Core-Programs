package com.bridgeLabz.basiccoreprograms;
import java.util.Scanner;
public class EvenOdd {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		if (n % 2 == 0)
			System.out.println(n + " is even");
		else
			System.out.println(n + " is odd");
	}

}
