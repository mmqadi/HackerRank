package algorithms.implementation;

import java.util.Scanner;

public class SaveThePrisoner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		for(int i = 0; i < t; i++) {
			int prisoners = in.nextInt();
			int sweets = in.nextInt();
			int s = in.nextInt();
			
			if((sweets+s-1)%prisoners==0)
	            System.out.println(prisoners);
	            else 
	            System.out.println((sweets+s-1)%prisoners);
			}
		
		

	}

}
