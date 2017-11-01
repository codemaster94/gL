package gayleLakmann;

import java.util.Scanner;

public class ZeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		setZeros(matrix);
		sc.close();
	}
	public static void setZeros(int[][] matrix) {
		int[] row = new int[matrix.length];
		int[] column = new int[matrix[0].length];
		// Store the row and column index with value 0
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[0].length;j++) {
		        if (matrix[i][j] == 0) {
		            row[i] = 1;
		            column[j] = 1;
		        }
		    }
		}

		// Set arr[i][j] to 0 if either row i or column j has a 0
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[0].length; j++) {
		        if ((row[i] == 1 || column[j] == 1)) {
		             matrix[i][j] = 0;
		        }
		    }
		 }
		display(matrix);
	}
	public static void display(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
