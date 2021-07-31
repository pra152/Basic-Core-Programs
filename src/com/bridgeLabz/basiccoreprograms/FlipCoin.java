package com.bridgeLabz.basiccoreprograms;

import java.util.Scanner;

public class FlipCoin {
	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int hCount = 0;
        int tCount = 0;
        System.out.print("How many coins wants to flip? ");
        int coinsCount = input.nextInt();
        for (int i=0; i < coinsCount; i++) {
            if (Math.random() < 0.5) {
                System.out.println("Heads");
                hCount++;
            } else {
                System.out.println("Tails");
                tCount++;
            }
        }
        System.out.println("Heads: "+hCount+", Tails: "+tCount);
        double percentOfHeads = (hCount*100)/coinsCount;

        double percentOfTails = (tCount*100)/coinsCount;

        System.out.println("percentage of heads is: " +percentOfHeads+"%");

        System.out.println("percentage of tails is: " +percentOfTails+"%");
    }
		
	}


