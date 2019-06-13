package algorithms.implementation;

import java.util.Scanner;

public class BeautifulDays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int j = in.nextInt();
		int k = in.nextInt();
		
		int count = 0;
		for(int a = i; a <= j; a++) {
			if(Math.abs(a - reverse(a)) % k == 0)
				count++;
		}
		
		System.out.println(count);
	}
	
	public static int reverse(int x) {
		int result = 0;
		int xRemaining = Math.abs(x);
		
		while(xRemaining != 0) {
			result = result * 10 + xRemaining % 10;
			xRemaining /= 10;
		}
		
		return x < 0? -result: result;
	}

}
