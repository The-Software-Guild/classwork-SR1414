package Matrices;

public class Sum {
	int a[][];
	int b[][];

	public Sum(int[][] a, int[][] b) {
		this.a = a;
		this.b = b;

	}

	public int[][] getC() {
		int c[][] = new int[a.length][b.length];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j]; // use - for subtraction

			}
		}

		return c;
	}

	public int[][] getA() {
		return a;
	}

	public void setA(int[][] a) {
		this.a = a;
	}

	public int[][] getB() {
		return b;
	}

	public void setB(int[][] b) {
		this.b = b;
	}

}
