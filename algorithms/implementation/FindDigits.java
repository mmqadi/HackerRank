package algorithms.implementation;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = in.nextInt();
			int v = n;
			int count = 0;
			while(v != 0) {
				int d = v % 10;
				
				if(d != 0 && n % d == 0) {
					count++;
				}
				
				v /= 10;
				
			}
			
			System.out.println(count);
		}
		in.close();
		
	}

}
