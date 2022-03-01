package com.wiley.egg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int numOfEggs = 0;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the number of eggs");
		numOfEggs = userInput.nextInt();
		Egg egg1 = new Egg(numOfEggs);
		
		System.out.println("You entered: "+ egg1.numOfEggs);
		System.out.println("You have " + egg1.gross + " gross, " + egg1.dozen + " dozen, and " + egg1.remainder + " eggs.");
				
				
		
		
	}
}
