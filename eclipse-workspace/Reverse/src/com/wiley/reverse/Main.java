package com.wiley.reverse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter a number you want to reverse: ");
		Reverse reverseNum = new Reverse(userInput.nextInt());

		reverseNum.setReverseNum(reverseNum.getNumber());

		System.out.println(reverseNum.getReverseNum());
	}
}
