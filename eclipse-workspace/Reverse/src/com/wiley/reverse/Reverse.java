package com.wiley.reverse;

public class Reverse {

	int inputNum;
	int reverseNum = 0;

	public Reverse(int inputNum) {
		this.inputNum = inputNum;
	}

	public int getNumber() {
		return inputNum;
	}

	public void setNumber(int inputNumber) {
		this.inputNum = inputNumber;
	}

	public int getReverseNum() {
		return reverseNum;
	}

	public void setReverseNum(int inputNum) {

		while (inputNum != 0) {
			int remainder = inputNum % 10;
			reverseNum = reverseNum * 10 + remainder;
			inputNum = inputNum / 10;
		}
		System.out.println("The reverse of the given number is: " + reverseNum);
		this.reverseNum = reverseNum;

	}

}
