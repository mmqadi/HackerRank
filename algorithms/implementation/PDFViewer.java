package algorithms.implementation;

import java.util.Scanner;

public class PDFViewer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] h = new int[26];
		
		for(int i = 0; i < 26; i++) {
			h[i] = in.nextInt();
		}
		
		String word = in.next();
		int max = -1;
		for(int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'a';
			if(h[index] > max)
				max = h[index];
		}
		
		System.out.println(word.length() * max);

	}

}
