package com.bridgeLabz.basiccoreprograms;
import java.util.Scanner;
public class HarmonicNumber {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number:");
		int n = sc.nextInt();
		double sum = 0.0;
		for (int i = 1; i <= n; i++) {
			sum += 1.0 / i;
		}

		System.out.println(sum);
	}

}
