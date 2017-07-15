package org.vaisham.basics;

public class MatrixCreator implements IMatrixCreator {

	

	/**
	 * 
	 * 
	 * create and return a 2D matrix
	 * 
	 * IT should contain first row with all 1s
	 *                   second row with all 2s
	 *                   third row with all 3s
	 *                   ..
	 *                   ..
	 *                   ..
	 *                   nth row with all ns
	 *                   
	 *                   
	 * eg: m = 2, n = 3
	 * 
	 * [  
	 * 	  1 	1		1
	 * 	  2 	2		2
	 * ]
	 * 
	 * 
	 */
	@Override
	public int[][] createINT2DMatrix(int m, int n) { 
		
		/**
		 * 
		 * int[] a = new int[4];
		 * 
		 * for(int i = 0; i < 4; i++) {
		 * 		a[i] = 1;
		 * }
		 * 
		 * a contains [1, 1, 1, 1]
		 * 
		 * int[][] b = new int[4][5];
		 * 
		 * for(int i = 0; i < 4; i++) {
		 * 		for(int j = 0; j < 5; j++) {
		 * 			b[i][j] = 1;
		 * 		}
		 * }
		 * 
		 * b contains [1, 1, 1, 1, 1
		 * 			   1, 1, 1, 1, 1
		 * 			   1, 1, 1, 1, 1
		 * 			   1, 1, 1, 1, 1]
		 * 
		 * 
		 * int[][][] c = new int[4][5][2]
		 * for(i = 0; i < 4; i++){
		 *  for(j = 0; j < 5; j++){
		 *   for(k = 0; k < 2; k++) {
		 *    c[i][j][k] = 1;
		 *   }
		 *  }
		 *  }
		 * 
		 * 
		 */
		
		
		int[][] mat = new int[m][n]; // 
		
		/**
		 * i here is the row index
		 * j here is the column index
		 * 
		 * eg: m = 2, n = 3
		 * 
		 * i = 0
		 * 		j = 0,	1,	2
		 * i = 1
		 * 		j = 0,	1,	2
		 * 
		 */
		for(int i = 0;i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = i + 1;
				System.out.println("mat"+mat[i][j]);
			}
			
		}
		
		return mat;
	}

	/**
	 * 
	 * 
	 * 
	 * create and return a 3D matrix
	 * 
	 * The value at any index of the matrix should
	 * be the sum of its indices
	 * 
	 * eg: matrix[a][b][c] = a + b + c;
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	@Override
	public int[][][] createINT3DMatrix(int x, int y, int z) {
		int[][][] matrix = new int[x][y][z];
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				for(int k = 0; k < z; k++) {
					matrix[i][j][k] = i + j + k;
					System.out.println("mat 1 "+matrix[i][j][k]);
				}
			}
		}
		
		return matrix;
	}
	
	/**
	 * initialize the matrix with sum og its indices at taht position
	 * 
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @return
	 */
	public int[][][][] createINT4DMatrix(int a, int b, int c, int d) {
		
		int[][][][] matrix = new int[a][b][c][d];
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				for(int k = 0; k < c; k++) {
					for(int t = 0; t < d; t++) {
						matrix[i][j][k][t] = i + j + k + t;
						System.out.println("mat"+matrix[i][j][k][t]);
					}
				}
			}
		}
		return matrix;
	}

	public static void main(String[] args) {
		MatrixCreator m = new MatrixCreator();
		m.createINT2DMatrix(2, 3);
	}
}
