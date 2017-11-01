package gayleLakmann;

import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[4][4];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println(rotate(matrix));
		
		
		sc.close();
	}
	private static boolean rotate(int[][] matrix) {
		if(matrix.length == 0 || matrix.length != matrix[0].length)
			return false;
		int n = matrix.length;
		for(int layer = 0; layer < n/2; layer++) {
			int first = layer;
			int last = n -1 - layer;
			for(int i = first; i < layer; i++) {
				int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last-offset][first];
				matrix[last-offset][first] = matrix[last][last - offset];
				matrix[last][last-offset] = matrix[i][last];
				matrix[i][last] = top;
				
			}
			
		}
		return true;
		
	}

}
