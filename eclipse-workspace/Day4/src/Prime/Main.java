package Prime;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		
		
		try {
			int primesUpTo = scan.nextInt();
			Prime.getPrimesUpTo(primesUpTo);
		}
		catch (Exception e) {
			System.out.println("Enter only integer");
		}
		
		
	}
}