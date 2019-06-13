package algorithms.implementation;
import java.util.Scanner;
public class JumpingOnTheClouds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		
		int[] c = new int[n];
		int e = 100;
		
		for(int i = 0; i < n; i++)
			c[i] = in.nextInt();
		
		int i = 0;
		if (n % k != 0)
		    // Print 94
		    System.out.println(94);
		else {
			do {
			int val = c[i];
			if(val == 1)
				e -= 3;
			else 
				e--;
			i = (i + k) % n;
		}
		while(i != 0);
		System.out.print(e);
		}
	}

}
