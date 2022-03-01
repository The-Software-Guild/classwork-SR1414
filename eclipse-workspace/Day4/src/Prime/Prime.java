package Prime;

import java.util.InputMismatchException;

public class Prime {

	int primesUpTo;

	public Prime() {
		super();
	}

	public static void getPrimesUpTo(int primesUpTo) {
		
		
			for (int i = 2; i <= primesUpTo; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}

			}
			if (isPrime == true) {
				System.out.print(i + " ");
			}
		 }
		
		
	}

	public void setPrimesUpTo(int primesUpTo) {
		this.primesUpTo = primesUpTo;
	}

}
