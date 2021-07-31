package com.bridgeLabz.basiccoreprograms;

import java.util.Scanner;

public class LeapYear {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a Year : ");
		int year = sc.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println(year + "is a leap year");
		else
			System.out.println(year + "is not a leap year");
	}
}
