package algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		BigInteger sol = new BigInteger(n+"");
		for(int i = n-1; i >= 1; i--) {
			sol = sol.multiply(new BigInteger(""+i));
		}
		
		System.out.print(sol);
		in.close();
	}

}
