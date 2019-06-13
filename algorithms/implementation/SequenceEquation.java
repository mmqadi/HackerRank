package algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceEquation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		List<Integer> p = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++)
			p.add(in.nextInt());
		
		for(int i = 1; i <=n; i++) {
			int index = p.indexOf(i) + 1;
			index = p.indexOf(index) + 1;
			System.out.println(index);
		}
	}

}
