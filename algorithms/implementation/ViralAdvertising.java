package algorithms.implementation;

import java.util.Scanner;

public class ViralAdvertising {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int people = 5;
		int count = 0;
		for(int i = 0; i < n; i++) {
			int like = people / 2;
			count += like;
			people = like * 3;
		}
		System.out.println(count);
	}

}
