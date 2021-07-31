package com.bridgeLabz.basiccoreprograms;

import java.util.Scanner;

public class PowerOfTwo {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int i = 0;
		int powerOfTwo = 1;
		while (i <= n) {
			System.out.println(i + " " + powerOfTwo);
			powerOfTwo = 2 * powerOfTwo;
			i = i + 1;

			if ((powerOfTwo % 4 == 0) && (powerOfTwo % 100 != 0) || (powerOfTwo % 400 == 0))
				System.out.println(powerOfTwo + "is a leap year");
			else
				System.out.println(powerOfTwo + "is not a leap year");

		}
	}

}
