package com.wiley.egg;

public class Egg {
	int numOfEggs;
	int gross;
	int dozen;
	int remainder;

	public Egg(int numOfEggs) {
		
		int eggs;
		this.numOfEggs = numOfEggs;
		eggs = numOfEggs;
		
		gross = eggs / 144;
		eggs = eggs % 144;
		dozen = eggs / 12;
		remainder = eggs % 12;

	}

	public int getNumOfEggs() {
		return numOfEggs;
	}

	public void setNumOfEggs(int numOfEggs) {
		this.numOfEggs = numOfEggs;
	}

	public int getGross() {
		return gross;
	}

	public void setGross(int gross) {
		this.gross = gross;
	}

	public int getDozen() {
		return dozen;
	}

	public void setDozen(int dozen) {
		this.dozen = dozen;
	}

	public int getRemainder() {
		return remainder;
	}

	public void setRemainder(int remainder) {
		this.remainder = remainder;
	}

}
