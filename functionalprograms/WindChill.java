package com.bridgeLabz.functionalprograms;
import java.util.Scanner;
public class WindChill {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Temperature and wind speed :");
		double t = sc.nextDouble();
		double v = sc.nextDouble();
		double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.println("Temperature = " + t);
		System.out.println("Wind speed  = " + v);
		System.out.println("Wind chill  = " + w);
	}

}
