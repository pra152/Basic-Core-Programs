package com.bridgeLabz.basiccoreprograms;
import java.util.Scanner;
public class QuotientAndRemainder {
	private static final Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
    {
		System.out.println("Enter The Dividend:");
		int dividend=sc.nextInt();
		System.out.println("Enter The Divisor:");
		int divisor=sc.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
    }

}
