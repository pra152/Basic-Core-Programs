package com.bridgeLabz.functionalprograms;
import java.util.Scanner;
public class Quadratic {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Three Number:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double root1, root2;
		double delta = b * b - 4 * a * c;
		System.out.println(delta);
		root1 = (-b + Math.sqrt(delta)) / (2 * a);
		root2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
	}

}
