package Matrices;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int b[][]={{1,3,4},{2,4,3},{1,2,4}};   
		
		Sum sumMatrice = new Sum(a, b);
		
		
		System.out.println(Arrays.deepToString(sumMatrice.getC()));
		
	}
}
