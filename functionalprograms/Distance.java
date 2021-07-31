package com.bridgeLabz.functionalprograms;
import java.util.Scanner;
public class Distance {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Two Number:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		double dist = Math.sqrt(x * x + y * y);
		System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
	}

}
