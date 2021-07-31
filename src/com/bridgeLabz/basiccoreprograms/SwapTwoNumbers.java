package com.bridgeLabz.basiccoreprograms;
import java.util.Scanner;
public class SwapTwoNumbers {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a, b, t;
		System.out.println("Enter the value of X and Y");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before swapping is: " + a + "  " + b);
		t = a;
		a = b;
		b = t;
		System.out.println("After swapping is: " + a + "   " + b);
		System.out.println();
	}

}
