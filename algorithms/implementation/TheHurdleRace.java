package algorithms.implementation;


import java.util.Scanner;

public class TheHurdleRace {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		
		//int height[] = new int[n];
		int max = -1;
		
		for(int i = 0; i < n; i++) {
			int inn = in.nextInt();
			if(inn > max) {
				max = inn;
			}	
		}
		
		System.out.println((max - k)> 0? (max-k): 0);
		in.close();
	}

}
