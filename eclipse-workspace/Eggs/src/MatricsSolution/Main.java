package MatricsSolution;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner userInput = new Scanner(System.in);
	
	Matrix matrix1 = new Matrix();
	
	for(int row = 0; row <= 2; row++) {
		for(int col = 0; col <= 2; col++) {
			System.out.println("Enter Value : ");
			int val = userInput.nextInt();
			matrix1.input(row, col, val);
		}
		
	}
	
	Matrix matrix2 = new Matrix();
	
	for(int row = 0; row <= 2; row++) {
		for(int col = 0; col <= 2; col++) {
			System.out.println("Enter Value : ");
			int val = userInput.nextInt();
			matrix2.input(row, col, val);
		}
		}
	Matrix matrix3=matrix1.add(matrix2);
	
	
}
}
