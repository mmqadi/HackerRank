package algorithms.implementation;

import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int q = in.nextInt();
		
		for(int i = 0; i < q; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			int count = (int)Math.floor(Math.sqrt(b)) - (int)Math.ceil(Math.sqrt(a)) + 1;
			
			System.out.println(count);
		}
		in.close();
		
	}

}
