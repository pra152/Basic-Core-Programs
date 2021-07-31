package com.bridgeLabz.basiccoreprograms;

import java.util.Scanner;

public class Factors {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Number:");
		long n = sc.nextLong();
		System.out.print("The prime factorization of " + n + " is: ");

		for (long factor = 2; factor * factor <= n; factor++) {
			while (n % factor == 0) {
				System.out.print(factor + " ");
				n = n / factor;
			}
		}
		if (n > 1)
			System.out.println(n);
		else
			System.out.println("Not available or itself");
	}

}
