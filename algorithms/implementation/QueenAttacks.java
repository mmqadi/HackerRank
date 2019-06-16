package algorithms.implementation;

import java.util.Scanner;

public class QueenAttacks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[][] board = new int[n][n];
		
		int k = in.nextInt();
		
		int r_q = in.nextInt() - 1;
		int c_q = in.nextInt() -1;
		
		for(int i = 0; i < k; i++) {
			int row = in.nextInt();
			int col = in.nextInt();
			board[row][col] = 1;
		}

		int count = 0;
		for(int row = r_q-1; row >=0; row--) {
			if(board[row][c_q] == 1) {
				break;
			}
			else {
				count++;
			}
		}
		
		
		
		System.out.println(count);
	}

}
