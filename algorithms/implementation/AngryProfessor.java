package algorithms.implementation;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		for(int cs = 0; cs < t; cs++) {
			int n = in.nextInt();
			int k = in.nextInt();
			
			//int[] a = new int[n];
			
			int count = 0;
			for(int i = 0; i < n; i++) {
				int a = in.nextInt();
				
				if(a <= 0) {
					count++;
				}
			}
			
			System.out.println((count < k)?"YES":"NO");
		}

	}

}
