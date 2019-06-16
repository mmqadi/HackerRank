package algorithms.implementation;

import java.util.Scanner;

public class JumpingClouds2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] c = new int[n];
		
		for(int i = 0; i < n; i++) {
			c[i] = in.nextInt();
		}
		
		int i = 0;
		int jump = 0;
		while(i +2 < n) {
			if(c[i+2] != 1) {
				i += 2;
			}
			else {
				i++;
			}
			jump++;
		}
		System.out.println(jump);
	}

}
